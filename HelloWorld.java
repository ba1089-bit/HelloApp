// UC6: Use enhanced for loop + substring

public class HelloWorld {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            String names = "";

            // Build string with delimiter
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", "
            names = names.substring(0, names.length() - 2);

            // Final output
            System.out.println("Hello " + names);
        }
    }
}