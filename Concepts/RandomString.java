package Grind75.Concepts;

import java.util.Random;

public class RandomString {


    public static void main(String[] args) {
        System.out.println(generate(20));
    }
    static String generate(int size) {
        StringBuffer sb= new StringBuffer();

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(26 * random.nextFloat());
            sb.append((char) (randomChar));
        }

        return sb.toString();
    }
}
