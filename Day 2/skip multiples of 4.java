public class SkipMultiplesOf4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}