import java.util.Scanner;

// Program to analyze numbers in array

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 5;
        int[] numbers = new int[size];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Analysis
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and Last elements are Equal");
        }
        else if (first > last) {
            System.out.println("First element is Greater than Last");
        }
        else {
            System.out.println("First element is Less than Last");
        }
    }
}