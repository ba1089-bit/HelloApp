import java.util.Scanner;

// Program to generate multiplication table

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int size = 10;
        int[] table = new int[size];

        // Store multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}