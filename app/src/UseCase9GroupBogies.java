import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9 - Group Bogies by Type using Collectors.groupingBy()
 */

class Bogie {
    String name;
    String type;   // Sleeper, AC Chair, First Class, Goods etc.

    public Bogie(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}

public class UseCase9GroupBogies {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Train Consist Management App ");
        System.out.println(" UC9: Group Bogies by Type ");
        System.out.println("=================================\n");

        // Step 1: Create bogie list
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", "Sleeper"),
                new Bogie("B2", "AC Chair"),
                new Bogie("B3", "Sleeper"),
                new Bogie("B4", "First Class"),
                new Bogie("B5", "AC Chair"),
                new Bogie("B6", "Goods")
        );

        // Step 2: groupingBy operation
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Step 3: Display result
        System.out.println("--- Grouped Bogies ---");

        groupedBogies.forEach((type, list) -> {
            System.out.println("\n" + type + " Bogies:");
            list.forEach(b -> System.out.println("  " + b));
        });
    }
}