public class UC4 {

    public static void main(String[] args) {
        String original = "racecar";
        char[] charArray = original.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.");
        }
    }
}