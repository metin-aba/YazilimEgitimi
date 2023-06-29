import java.util.Scanner;

public class MaceraOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.print("Enter your character name: ");
        String playerName = scanner.nextLine();

        Character player = new Character(playerName);

        System.out.println("Hello, " + player.getName() + "! Let the adventure begin!");

        while (player.isAlive()) {
            System.out.println("-----------------------------------");
            System.out.println("Options:");
            System.out.println("1. Explore");
            System.out.println("2. Rest");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.explore();
                    break;
                case 2:
                    player.rest();
                    break;
                case 3:
                    System.out.println("Thank you for playing! Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }

        System.out.println("Game over! " + player.getName() + " is defeated.");
    }
}

class Character {
    private String name;
    private int health;
    private int energy;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void explore() {
        System.out.println(name + " is exploring the surroundings...");
        energy -= 20;

        if (energy < 0) {
            energy = 0;
        }

        System.out.println("Energy: " + energy);
    }

    public void rest() {
        System.out.println(name + " is taking a rest...");
        health += 20;
        energy += 10;

        if (health > 100) {
            health = 100;
        }

        if (energy > 100) {
            energy = 100;
        }

        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
    }
}
