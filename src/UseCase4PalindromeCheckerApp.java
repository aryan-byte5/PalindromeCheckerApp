import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    // Method to check if a string is a palindrome using char array
    public static boolean checkPalindrome(String text) {

        // Convert string into character array
        char[] charArray = text.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        // Two-pointer comparison
        while (left < right) {

            if (charArray[left] != charArray[right]) {
                return false;   // Not a palindrome
            }

            left++;
            right--;
        }

        return true;  // It is a palindrome
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC4: Palindrome Checker App =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("Output: The string is a Palindrome.");
        } else {
            System.out.println("Output: The string is NOT a Palindrome.");
        }

        sc.close();
    }
}