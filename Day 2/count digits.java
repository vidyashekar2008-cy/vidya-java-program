public class CountDigits {
    public static void main(String[] args) {

        int n = 45823;
        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println(n + " has " + count + " digits");
    }
}