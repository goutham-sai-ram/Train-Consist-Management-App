import java.util.*;

/**
 * UC10 - Count Total Seats using reduce()
 */

class Bogie {
    String name;
    String type;
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }
}

public class UseCase10SeatCapacityCalculation {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" UC10: Total Seat Capacity ");
        System.out.println("=================================\n");

        // Step 1: Create bogie list
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", "Sleeper", 72),
                new Bogie("B2", "AC Chair", 48),
                new Bogie("B3", "Sleeper", 72),
                new Bogie("B4", "First Class", 36),
                new Bogie("B5", "AC Chair", 48)
        );

        // Step 2: reduce operation
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: output
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}