import java.util.HashMap;
import java.util.Map;

public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" UC6: Bogie Capacity Mapping ");
        System.out.println("=================================");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // Display all entries
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram Completed!");
    }
}