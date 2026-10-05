interface Playable {
    void play();
}

class Guitar implements Playable {

    public void play() {
        System.out.println("Guitar is playing");
    }
}

public class Piano implements Playable {

    public void play() {
        System.out.println("Piano is playing");
    }

    public static void main(String[] args) {

        Playable p;

        p = new Guitar();
        p.play();

        p = new Piano();
        p.play();
    }
}