public class Counter {
    private int count;

    void increment() {
        count++;
    }

    void decrement() {
        if (count > 0) {
            count--;
        }
    }

    void reset() {
        count = 0;
    }

    int getCount() {
        return count;
    }

    public static void main(String[] args) {

        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();

        System.out.println("Count = " + c.getCount());

        c.decrement();
        System.out.println("After decrement = " + c.getCount());

        c.reset();
        System.out.println("After reset = " + c.getCount());
    }
}