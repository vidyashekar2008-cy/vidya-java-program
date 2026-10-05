public class Time {
    int h, m, s;

    Time(int h) {
        this(h, 0);
    }

    Time(int h, int m) {
        this(h, m, 0);
    }

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public static void main(String[] args) {

        Time t1 = new Time(10);
        Time t2 = new Time(10, 30);
        Time t3 = new Time(10, 30, 45);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}