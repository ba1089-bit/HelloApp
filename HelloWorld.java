// UC5: Using enhanced for loop (for-each)

public class HelloWorld {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Enhanced for loop
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}