public class Ticket {
    static int counter = 101;

    String id;
    String passengerName;

    Ticket(String passengerName) {
        this.id = "T" + counter;
        counter++;
        this.passengerName = passengerName;
    }

    void display() {
        System.out.println("Ticket ID : " + id);
        System.out.println("Passenger : " + passengerName);
    }

    public static void main(String[] args) {

        Ticket t1 = new Ticket("Ravi");
        Ticket t2 = new Ticket("Kiran");
        Ticket t3 = new Ticket("Anu");

        t1.display();
        t2.display();
        t3.display();
    }
}