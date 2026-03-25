// UC7: Using String.join()

public class HelloWorld {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join names with comma
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello " + names);
        }
    }
}