package OOPs.video5.family;

import OOPs.video5.family.parent;

public class Son extends parent {

    @Override
    void career(String name) {
        System.out.println("ill be a rapper coz im " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("ill marry "+ name + "and she is " + age );
    }
    public Son(int age){
        super(age);
    }

}
