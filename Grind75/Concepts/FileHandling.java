package Grind75.Concepts;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("ENTER SOME LETTERS : ");
//            int letters = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }



        try(FileReader fr = new FileReader("note.txt")){
            System.out.println("ENTER SOME LETTERS : ");
            int letters = fr.read();
            while (fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // InputStreamReader converts byte(i/o) stream to char(reader/writer) stream
        // BufferedReader reads the converted char stream


//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) {
//            System.out.println
//        }



    }
}
