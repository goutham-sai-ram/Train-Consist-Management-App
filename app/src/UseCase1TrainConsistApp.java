import java.util.ArrayList;
import java.util.List;

/**
 * UseCase1TrainConsistApp
 *
 * @author Goutham
 * @version 1.0
 */

public class UseCase1TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("=================================");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nTrain initialized successfully!");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Extra line (IMPORTANT for Git PR difference)
        System.out.println("UC1 Completed");

        // Program continues...
    }
}