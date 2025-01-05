package OOPs.video5.family;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
//        son.career("Suvrat");
//        son.partner("Aastha", 20);
        int age = son.age;
        System.out.println(age);

        Daughter beti= new Daughter(30);
//        beti.career("minority");
//        beti.partner("harvanvi", 40);


        //qki parent abstract hai isliye override hoga

//        parent mom = new parent() {
//            @Override
//            void career(String name) {
//
//            }
//
//            @Override
//            void partner(String name, int age) {
//
//            }
//        }
        son.greet();

    }
}
