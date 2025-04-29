import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // Array to store 5 integers
        Scanner scanner = new Scanner(System.in);

        // Input values from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the numbers
        System.out.println("\nYou entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}
