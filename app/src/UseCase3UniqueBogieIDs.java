import java.util.HashSet;
import java.util.Set;

/**
 * UseCase3UniqueBogieIDs
 *
 * @author Goutham
 * @version 3.0
 */

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" Version: 3.0 ");
        System.out.println("=================================");

        // Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nUC3 Completed");
    }
}