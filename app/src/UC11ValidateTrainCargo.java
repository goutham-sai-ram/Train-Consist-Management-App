import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * UC11 - Validate Train ID & Cargo Code using Regex
 */

public class UC11ValidateTrainCargo {

    public static void main(String[] args) {

        System.out.println("=== UC11: Train ID & Cargo Code Validation ===");

        // Sample inputs (you can change and test)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Match Train ID
        Matcher trainMatcher = trainRegex.matcher(trainId);
        boolean isTrainValid = trainMatcher.matches();

        // Match Cargo Code
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        System.out.println("Train ID: " + trainId);
        System.out.println("Train ID Valid? " + isTrainValid);

        System.out.println("Cargo Code: " + cargoCode);
        System.out.println("Cargo Code Valid? " + isCargoValid);

        System.out.println("\nValidation Completed.");
    }
}