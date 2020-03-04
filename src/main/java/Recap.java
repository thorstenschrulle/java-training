public class Recap {
    public static void main(String[] args) {
        Person p = new Person("Otto", "Kern");
//        Person p2 = new Person();

        p.printPerson();
        p.setLastName("sdfsdf");
        System.out.println("Full Name: " +p.fullName());
    }
}

