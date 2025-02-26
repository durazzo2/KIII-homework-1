public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println(model + " is now going at " + speed + " km/h.");
    }
}
