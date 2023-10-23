import java.util.Scanner;

public class IntegerReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a new Scanner object for user input

        System.out.print("Enter an integer to reverse: ");  
        int number = scanner.nextInt();  // Read the integer input from the user

        int reversed = reverseInteger(number);  // Call the reverseInteger function to get the reversed integer
        System.out.println("Reversed Integer: " + reversed);  // Display the reversed integer
    }

    public static int reverseInteger(int num) {
        int reversed = 0;  // Initialize the reversed integer to 0

        // While the number is not 0, continue reversing
        while (num != 0) {
            // Multiply the reversed number by 10 and add the last digit of num
            reversed = reversed * 10 + num % 10;

            num /= 10;  // Remove the last digit from num
        }

        return reversed;  // Return the reversed integer
    }
}