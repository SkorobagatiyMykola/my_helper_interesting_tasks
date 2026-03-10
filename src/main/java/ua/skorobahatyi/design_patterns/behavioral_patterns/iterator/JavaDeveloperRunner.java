package ua.skorobahatyi.design_patterns.behavioral_patterns.iterator;


public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring","Hibernate", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Mykola Skorobagatyi",skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
