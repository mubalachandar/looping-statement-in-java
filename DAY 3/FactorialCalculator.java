import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else { 
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i; 
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }

        scanner.close();
    }
}
