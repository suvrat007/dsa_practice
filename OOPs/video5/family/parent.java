package OOPs.video5.family;

public abstract class parent {
    int age;
    public parent(int age){
        this.age=age;
    }
    abstract void career (String name);
    abstract void partner(String name, int age);

    void greet(){
        System.out.println("hello bkl");
    }
}
