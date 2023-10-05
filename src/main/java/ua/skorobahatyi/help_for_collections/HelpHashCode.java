package ua.skorobahatyi.help_for_collections;

public class HelpHashCode {
    public static void main(String[] args) {
        Integer i=4;
        Integer i2=4456;
        Integer i3=487985415;
        System.out.println(i.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i3.hashCode());

        ////////////////
        Object obj = new Object();
        System.out.println(obj.hashCode());
        User user = new User(1,"Nick","Skorobagatiy",43,"nick@gmail.com");
        System.out.println(user.hashCode());

        String name="Nick";
        System.out.println(name.hashCode());

        Double d1= Double.valueOf(1.25);
        System.out.println(d1.hashCode());

        Long l1= 12356865181556554l;
        Long l2= 12356865181556554l;
        System.out.println(l1.hashCode());
    }
}
