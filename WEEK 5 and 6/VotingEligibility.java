import java.util.Scanner;

// Program to check voting eligibility of 10 students

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents = 10;
        int[] ages = new int[totalStudents];

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.err.println("Invalid age: " + ages[i]);
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote");
            }
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote");
            }
        }
    }
}