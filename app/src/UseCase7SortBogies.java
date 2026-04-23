import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UseCase7SortBogies {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" UC7: Sort Bogies by Capacity ");
        System.out.println("=================================");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted Bogies (Low → High Capacity):");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram Completed!");
    }
}