interface Camera {
    void takePhoto();
}

interface GPS {
    void getLocation();
}

public class SmartPhone implements Camera, GPS {

    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void getLocation() {
        System.out.println("Location: Bangalore");
    }

    public static void main(String[] args) {

        Camera c = new SmartPhone();
        c.takePhoto();

        GPS g = new SmartPhone();
        g.getLocation();
    }
}