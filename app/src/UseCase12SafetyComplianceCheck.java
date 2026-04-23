import java.util.*;
import java.util.stream.Collectors;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 * Demonstrates Stream API + allMatch validation
 */

class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyComplianceCheck {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" UC12: Safety Compliance Check ");
        System.out.println("=================================");

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        // Step 2: Stream safety validation
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical must carry only Petroleum
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Step 3: Output result
        System.out.println("\n--- Safety Validation Result ---");

        if (isSafe) {
            System.out.println("TRAIN IS SAFE ✔");
        } else {
            System.out.println("TRAIN IS NOT SAFE ❌");
        }

        System.out.println("\nProgram completed.");
    }
}