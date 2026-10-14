import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    // create a main function (starting point of all Java program)
    public static void main(String[] args){
        System.out.println("Hello World!");

        // Java is a Strongly-typed language
        // every variable and parameter is given a data type
        // and it cant be changed. Java will enforce the data type
        // STRICTLY (TypeScript is the JavaScript eqv.)

        // numbers in Java
        // int goes from -2b + 2b
        int secretOfLife = 42;
        // short goes from -32k to 32k
        short small = 12;

        // double is for floating point number (64-bit)
        double gstPercentage = 0.09;
        // float is only 32-bit precision
        float pi = 3.14f;

        // char
        // a char represents one SYMBOL (One character) in a string
        char c = 'a';

        // Boolean
        boolean isRaining = true;

        // Strings
        // Strings in Java must have double quotes
        // Strings in Java are an object but they are not references
        // Strings in Java is not primitive, they need to start with cap "S"
        String s = "She sells seashells at the seashore";

        // Arrays in Java are fixed length
        // Unlike JS where array is infinite and can grow
        // We must give fixed length to Java arrays and they cannot change their size
        int[] a = new int[3]; // create a new array of integer with size 3
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        System.out.println(a[1]);

        // data structure are ways of storing and retriving (searching ) data
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(101);
        numbers.add(102);
        System.out.println(numbers.get(1));

        // key/value pairs
        HashMap<String, Integer> months = new HashMap<>();
        months.put("jan", 31);
        months.put("feb", 28);
        months.put("mar", 30);

        System.out.println(months.get("feb"));

        // someother combination
        HashMap<integer, String> users = new HashMap<>();

        System.out.println(addTwo(3,4));
        System.out.println(addTwo(3,4.4)); 

    }

    // function that accepts two integers and return the sum
    public static int addTwo(int n1, int n2) {
        return n1 + n2;
    }

    // same name as another method with different data type for return and/or parameters
    // overloaded method
    public static double addTwo(double d1, double d2) {
        return d1 + d2; 
    }
}