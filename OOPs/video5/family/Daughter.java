package OOPs.video5.family;

public class Daughter extends parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("ill be a housewife coz im a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("ill marry " + name + "hes "  + age);
    }
}
