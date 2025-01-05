package OOPs.video5.car;

public class Car implements Engine,Brake,Media {

    // INTERFACE se multiple inheritance kar sakte hai
    @Override
    public void brake() {
        System.out.println("bbhadiya break");
    }

    @Override
    public void start() {
        System.out.println("makhan start");
    }

    @Override
    public void stop() {
        System.out.println("gaadi band");
    }

    @Override
    public void acc() {
        System.out.println("baga bc");
    }
}
