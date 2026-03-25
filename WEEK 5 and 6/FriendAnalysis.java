import java.util.Scanner;

// Program to find youngest and tallest friend

public class FriendAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int size = names.length;

        int[] ages = new int[size];
        double[] heights = new double[size];

        // Input with validation
        for (int i = 0; i < size; i++) {

            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height: ");
            heights[i] = sc.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.err.println("Invalid input! Please enter again.");
                i--; // retry
            }
        }

        // Assume first is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Compare
        for (int i = 1; i < size; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
    }
}