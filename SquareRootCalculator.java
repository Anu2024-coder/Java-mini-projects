import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("Square root of negative numbers is not real.");
        } else {
            double sqrt = Math.sqrt(num);
            System.out.println("Square root of " + num + " is: " + sqrt);
        }

        sc.close();
    }
}
