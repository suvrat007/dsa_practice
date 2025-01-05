package OOPs.video5.car;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power chala");
    }

    @Override
    public void stop() {
        System.out.println("power ruka");
    }

    @Override
    public void acc() {
        System.out.println("power baga");
    }
}
