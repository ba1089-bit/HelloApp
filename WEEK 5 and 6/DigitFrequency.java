import java.util.Scanner;

// Program to find frequency of each digit in a number

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Validation
        if (number < 0) {
            System.err.println("Invalid input! Number must be non-negative.");
            System.exit(0);
        }

        long temp = number;
        int digitCount = 0;

        // Count digits
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];

        temp = number;

        // Store digits in array
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp = temp / 10;
        }

        // Frequency array (0–9)
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Display result
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}