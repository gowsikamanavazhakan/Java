import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Input names from the user
        while (true) {
            System.out.print("Enter a name (or 'done' to finish): ");
            String name = scanner.nextLine().trim();
            
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            
            names.add(name);
        }
        
        // Ask the user for sorting order
        System.out.print("Sort in ascending (A) or descending (D) order? ");
        String sortOrder = scanner.nextLine().trim().toLowerCase();
        
        // Sort the names based on user choice
        if (sortOrder.equals("a")) {
            Collections.sort(names); // Ascending order
        } else if (sortOrder.equals("d")) {
            Collections.sort(names, Collections.reverseOrder()); // Descending order
        } else {
            System.out.println("Invalid choice. Sorting in ascending order by default.");
            Collections.sort(names); // Default to ascending order
        }
        
        // Display the sorted names
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
