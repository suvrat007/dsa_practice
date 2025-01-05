package OOPs.video5.car;

public class NiceCar {
    private Engine eng;
    private Media player=new CD();
    //default engine type
    public NiceCar(){
        eng = new PowerEngine();
    }
    public void engupgrade(){
        eng=new ElectricEngine();
    }
    public NiceCar(Engine eng){
        this.eng=eng;
    }
    public void start(){
        eng.start();
    }
    public void stop(){
        eng.stop();
    }
    public void acc(){
        eng.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
}
