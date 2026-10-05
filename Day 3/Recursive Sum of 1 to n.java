public class RecursiveSum {

    static int sum(int n) {

        // Base case
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int result = sum(10);

        System.out.println("Sum of 1 to 10 = " + result);
    }
}