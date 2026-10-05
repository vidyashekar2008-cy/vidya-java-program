class Counter {
    private int count;

    // Increment count
    public void increment() {
        count++;
    }

    // Decrement count, but never below 0
    public void decrement() {
        if (count > 0) {
            count--;
        }
    }

    // Reset count to 0
    public void reset() {
        count = 0;
    }

    // Get current count
    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();

        System.out.println("Count after increment: " + c.getCount());

        c.decrement();

        System.out.println("Count after decrement: " + c.getCount());

        c.reset();

        System.out.println("Count after reset: " + c.getCount());

        c.decrement();

        System.out.println("Count after decrement: " + c.getCount());
    }
}