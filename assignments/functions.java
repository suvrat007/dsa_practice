package assignments;

import java.util.*;
public class functions {

    // to pass assignments.arrays to a function use [(data type)...v]
    // make sure the above thing is in the last of the arguments
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num1=sc.nextInt();

//        int num2=sc.nextInt();
//        System.out.println("sum = " + sum(num1,num2));
//        System.out.println("product = "+ prod(num1,num2));
//        prime(num1,num2);
//        grade(num1);
//        fact(num1);
//        palind(num1);
        pyth();
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int prod(int a , int b){
        return a*b;
    }
    static void prime(int a, int b){

        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }

        for (int i = 1; i <max ; i++) {
            if (a%i==0){
                System.out.println(a + "is composite");
            } else{
                System.out.println(a+" is prime");
                break;
            }
            if (b%2==0) {
                System.out.println(b +" is prime");

            }else{
                System.out.println(b+"is prime");
                break;
            }
        }

    }

    static void grade(int a){
        if (a<=100 && a>=91){
            System.out.println("AA");
        } else if (a>=81 && a<=90) {
            System.out.println("AB");
        }else if (a>=71 && a<=80) {
            System.out.println("BB");
        }else if (a>=61 && a<=70) {
            System.out.println("BC");
        }else if (a>=51 && a<=60) {
            System.out.println("CD");
        }else if (a>=41 && a<=50) {
            System.out.println("DD");
        }else if (a<=40) {
            System.out.println("FAIL");
        }
    }

    static void fact(int a){
        int fac=1;
        if(a==1 ||a==0){
            System.out.print("1");
        }else{

        for (int i = 0; i < a; i++) {
            int b = (a - i);
            if (i == (a - 1)) {
                System.out.print(b + " = " + fac);
            } else {
                System.out.print(b + " * ");
                fac = fac * b;
            }

            }


        }
    }

    static void palind(int a) {
        int n,rem,sum=0,c;
        c=a;
        while (a>0){

            rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;


        }
        if(sum==c){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    static void pyth(){
        //to take assignments.arrays as input parameter....
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total number of num u wanna enter : ");
        int lim=sc.nextInt();
        int [] arr=new int[lim];
        for (int i = 0; i < lim; i++) {
            System.out.print("Enter ur number : ");
            arr[i]=sc.nextInt();

        }
        int m=0,s=0;

        for (int i = 0; i < arr.length; i++) {
            int a =arr[i];
            for (int j = 0; j < arr.length; j++) {
                int b=arr[j];
                for (int k = 0; k < arr.length; k++) {
                    int c=arr[k];
                    if ((a*a)+(b*b)==(c*c)){
                        m+=1;
                    }else {
                        s+=1;
                    }

                }

            }
        }
        if (m>0){
            System.out.println("has pyth triplet");

        }else{
            System.out.println("no pytha triplet");
        }


    }

}
