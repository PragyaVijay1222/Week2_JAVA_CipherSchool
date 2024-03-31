import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read integer input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("Integer entered: " + num);

        // Read floating-point input
        System.out.print("Enter a floating-point number: ");
        double decimal = scanner.nextDouble();
        System.out.println("Floating-point number entered: " + decimal);

        // Read string input
        System.out.print("Enter a string: ");
        String str = scanner.next(); // Reads a single word
        // String str = scanner.nextLine(); // Reads entire line
        System.out.println("String entered: " + str);

        // Close the Scanner object
        scanner.close();
    }
}
