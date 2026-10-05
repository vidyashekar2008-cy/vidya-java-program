public class Main {

    // Recursive method to check palindrome
    static boolean isPalindrome(String s) {

        // Base case
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        // Compare first and last characters
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Check the middle part recursively
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {

        System.out.println("madam: " + isPalindrome("madam"));
        System.out.println("java: " + isPalindrome("java"));
    }
}