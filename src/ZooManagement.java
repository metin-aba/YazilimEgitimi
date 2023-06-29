import java.util.ArrayList;
import java.util.List;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Animal("Simba", "Lion", 5);
        Animal elephant = new Animal("Dumbo", "Elephant", 10);
        Animal giraffe = new Animal("Melman", "Giraffe", 7);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);

        zoo.printAnimalList();

        zoo.removeAnimal(elephant);

        System.out.println("Updated Animal List:");
        zoo.printAnimalList();
    }
}

class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }
}

class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void printAnimalList() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Species: " + animal.getSpecies());
            System.out.println("Age: " + animal.getAge());
            System.out.println("---------------------------");
        }
    }
}
