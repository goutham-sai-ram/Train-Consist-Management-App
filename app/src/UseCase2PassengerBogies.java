import java.util.ArrayList;
import java.util.List;

/**
 * UseCase2PassengerBogies
 *
 * @author Goutham
 * @version 2.0
 */

public class UseCase2PassengerBogies {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" Version: 2.0 ");
        System.out.println("=================================");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies
        System.out.println("\nBogies after adding:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper present? " + exists);

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 Completed");
    }
}