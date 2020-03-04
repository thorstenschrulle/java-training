import java.util.*;
class Person {
   private String firstName;
   private String lastName;
    int nr;
    // Constructor
    public Person(String initialFirstname, String initialLastName) {
        firstName = initialFirstname;
        lastName = initialLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String fullName () {
        return firstName + " " + lastName;
    }


    // Instance method call it a person instance - you need a object
    public void printPerson() {
        System.out.println("Name: " + fullName());
        System.out.println("Nummer: " + nr);

    }

    public static void  test () {
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
    }
}
