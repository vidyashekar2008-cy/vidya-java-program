public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 121;
        checkPalindrome(n);

        n = 123;
        checkPalindrome(n);
    }

    static void checkPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
    }
}