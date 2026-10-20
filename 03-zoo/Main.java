import java.util.ArrayList;

class Animal {
    private String name;

    public Animal() {
        name = "N/A";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("<Some Animal Noise>");
    }
}

class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("LION ROAR");
    }
}

class Eagle extends Animal {

    public Eagle() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("EAGLE SCREECH");
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Leo"));
        lions.add(new Lion("Scarface"));

        ArrayList<Eagle> eagles = new ArrayList<>();
        eagles.add(new Eagle());

        // Polymorphism
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Leo"));
        zoo.add(new Eagle());

        for (Animal a : zoo) {
            a.speak();
        }
    }
}