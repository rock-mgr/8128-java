public class Main {
    public static void main(String[] args) {
        // new Person() will return an object, which data type is Person
        Person ahkow = new Person();
        ahkow.firstName = "Ah Kow";
        ahkow.lastName = "Tan";
        ahkow.age = 42;
        System.out.println(ahkow.firstName + "," + ahkow.lastName + "," + ahkow.age);
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
}