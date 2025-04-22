import java.util.Scanner;
/**
 * This program recursively reverses a string entered by the user.
 * Author: Alex Kapajika
 * Version: 1.0
 * Since: 2025-04-22
 */
public final class ReverseString {
    /**
     * Private constructor to prevent instantiation.
     * @throws IllegalStateException Utility class.
     */
    private ReverseString() {
        throw new IllegalStateException("Utility Class");
    }
    /**
     * Recursively reverses a string.
     *
     * @param str The input string.
     * @return The reversed string.
     */
    public static String reverseString(final String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    /**
     * Main method to prompt the user and display the reversed string.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
