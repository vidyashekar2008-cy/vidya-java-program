public class PassByValue {

    static void changeNum(int x) {
        x = 100;
    }

    static void changeArr(int[] a) {
        a[0] = 100;
    }

    public static void main(String[] args) {

        int num = 5;
        int[] arr = {5};

        System.out.println("num before: " + num);
        changeNum(num);
        System.out.println("num after: " + num);

        System.out.println("arr[0] before: " + arr[0]);
        changeArr(arr);
        System.out.println("arr[0] after: " + arr[0]);
    }
}