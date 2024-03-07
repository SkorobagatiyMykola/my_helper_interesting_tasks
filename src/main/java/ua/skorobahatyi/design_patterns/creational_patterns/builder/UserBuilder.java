package ua.skorobahatyi.design_patterns.creational_patterns.builder;

/**
 * Created template on 07/03/2024
 * */
public class UserBuilder {
    private String name;
    private String surname;
    private int age;
    private String birthDate;
    private String hobbies;

    public UserBuilder() {
    }

    public UserBuilder(String name, String surname, int age, String birthDate, String hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    public static Builder newBuilder() {
        return new UserBuilder().new Builder();
    }
    public class Builder{
        public Builder setName(String name) {
            UserBuilder.this.setName(name);

            return this;
        }

        public Builder setSurname(String surname) {
            UserBuilder.this.setSurname(surname);

            return this;
        }

        public Builder setAge(int age) {
            UserBuilder.this.setAge(age);

            return this;
        }

        public Builder setBirthday(String birthday) {
            UserBuilder.this.setBirthDate(birthday);

            return this;
        }

        public Builder setHobbies(String hobbies) {
            UserBuilder.this.setHobbies(hobbies);

            return this;
        }

        public UserBuilder build(){
            return UserBuilder.this;
        }

    }
}
