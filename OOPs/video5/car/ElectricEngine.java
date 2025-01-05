package OOPs.video5.car;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Tesla chali");
    }

    @Override
    public void stop() {
        System.out.println("Tesla ruki");
    }

    @Override
    public void acc() {
        System.out.println("Tesla bhagi");
    }
}
