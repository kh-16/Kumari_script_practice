import java.util.Scanner;

    public class SumCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum is: " + sum);

            scanner.close();
        }
    }

