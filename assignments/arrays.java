package assignments;

import java.util.ArrayList;
import java.util.*;

public class arrays {
    // for (int num : arr).....sout (num  + " ")
    /*this will go on each element of array and print it*/

    // PRIMITIVES :- qntities that cn not be further broken down like boolean, int etc.
    //the are stored in stack
    // OBJECTS :-
    // Stored in heap mem and accessed reference variable (arr[0]).

    // int [][] arr=new int[3][] .......(rows is mandatory).......[array of assignments.arrays]

    // arr[rows][colums]
    // arr[rows].length
    // ENHANCED FOR LOOP for printing
    /* for (int a : arr){
     * sout (Arrays.toString(a))
     * }*/
    // ArrayList<integer> list = new Arraylist <>();
    // for assignments.arrays who u do not know the size
    // list.add() , list.set(index, towhat), list.remove(index), list.get(index)
    // arraylist does have a limit....but when limit is reached....new list created....old ones added to new....new elements add to new too

    // CONVERT STRING TO ARRAY.........Arrays.toString(strvariablename.toCharArray())

    public static void main(String[] args) {

//        Scanner sc =new Scanner(System.in);
//        int [] arr = new int[4];
//        int [] arr1 = new int[4];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }


// 2. WAP for concatenation

/*
        int [] arr2 = new int[arr1.length+arr.length];


        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=sc.nextInt();
        }

        for (int i = 0; i < (arr.length+arr1.length); i++) {
            if(i<arr.length){
                arr2[i]=arr[i];
            }else{
                arr2[i]=arr1[i- arr1.length];
            }


        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " , ");

        }*/

// 3. sum of elements

/*        int sum=0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum=sum+arr[j];

            }
        arr1[i]=sum;
        sum=0;

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " , ");
        }*/

// 4. WAP max val of customer

/*        int[][] accounts={{1,5},{7,3},{3,5}};
        int[] data=new int[accounts.length];
        int sum=0;

        for (int cstmer = 0; cstmer < accounts.length; cstmer++) {
            for (int accbal = 0; accbal < accounts[cstmer].length; accbal++) {
                sum=sum +accounts[cstmer][accbal];
            }
            data[cstmer]=sum;
            sum=0;

        }
        int max=0;

        for (int cstmer = 0; cstmer < data.length ; cstmer++) {

            System.out.println("Customer"+ (cstmer+1)+" = "+ data[cstmer]);
            if (data[cstmer]>max){
                max=data[cstmer];
            }else{
                max=data[cstmer];
            }

        }
        System.out.println("Max value is "+ max);*/

// 5. WAP to shuffle array
/*

        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] arr=new int[2*n];


        for (int i = 0; i < n; i++) {
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[i+n];
        }
        System.out.println(Arrays.toString(arr));*/

// 6. KIDS and candies wala

/*        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        Boolean[] arr = new Boolean[candies.length];
        int sum=0;

        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i]+extraCandies;


            for (int j = 0; j < candies.length; j++) {
                if (temp >= candies[j]) {
                    sum++;

                }
            }
            if(sum==candies.length){
                arr[i]=true;
            }else{
                arr[i]=false;
            }
            sum=0;
        }
        System.out.print(Arrays.toString(arr));*/


//  23. LUCKY NUMBERS
/*
        int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int minval=0,index=0,max=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                minval=matrix[i][0];

                if (matrix[i][j]<minval){
                    minval=matrix[i][j];
                    index=j;
                }

            }

            for (int j = 0; j < matrix.length; j++) {
                max=matrix[0][index];
                for (int k = 1; k < matrix.length; k++) {
                    if (max < matrix[k][index]) {
                        max = matrix[k][index];
                    }
                }
            if (max==minval){
                System.out.println("luncky nummber = "+ minval);
                break;
                }

            }




        }*/


// 7. GOOD PAIRS IN array
/*
        int[] nums={1,2,3};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    System.out.print("(" + i + "," + j + ")");
                    sum++;
                }
            }
        }
        System.out.println();
        System.out.println("total good pairs = "+sum);*/

// 8. numbers smaller than current
/*        int[] nums = {7,7,7,7};
        int[] arr=new int[nums.length];
        int grter=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    grter++;
                }
            }
            arr[i]=grter;
            grter=0;
        }
        System.out.println(Arrays.toString(arr));*/


//        String alpha = "qwertyuiopasdfghjklzxcvbnm";
//        String arr= Arrays.toString(alpha.toCharArray());
//        String word="thequickbrownfoxjumpsoverthelazydog";
//        String check= Arrays.toString(alpha.toCharArray());
//
//        for (int i = 0; i < arr.length(); i++) {
//            for (int j = 0; j < check.length(); j++) {
//                if (arr[i]==check[j]){
//
//                }
//
//            }
//
//        }

//10. PANGRAM (RETRY)


//attempt 1

//        String alpha = "qwertyuiopasdfghjklzxcvbnm";
//        String word="thequickbrownfoxjumpsoverthelazydog";
//        int ran=0;
//
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = 0; j < alpha.length(); j++) {
//                if (word.charAt(i)==alpha.charAt(j)){
//                    ran++;
//                }
//
//            }
//
//        }

//attempt 2

        ////            if (i==0){
////                alpha[i]=sentence.charAt(i);
////            }else{
////                for (int j = 0; j <= i; j++) {
////                    if (alpha[j]!=sentence.charAt(i)) {
////                        alpha[i] = sentence.charAt(i);
////                        break;
////                    }
////                }
////            }
////            System.out.print(alpha[i]);


//attempt 3

//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        boolean[] alpha= new boolean[26];
//        boolean pangram=true;
//
//        for (int i = 0; i < sentence.length(); i++) {

//            char ch=Character.toLowerCase(sentence.charAt(i));   // convert to lower case
//            if (Character.isLetter(ch)){                         // check ki letter hai ki nahi
//                alpha[ch-'a']=true;                              // mark wo index true....(a - a=0) , (b - a = 1) .....
//            }
//        }
//        for (int i = 0; i < 26; i++) {
//            if (alpha[i] != true) {
//                pangram = false;
//            }
//
//        }
//
//        if (pangram) {
//            System.out.println("pangram");
//        } else {
//            System.out.println("not pangram");
//        }



// 11. Matching a rule

//        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
//        String[] rule={"type","color","name"};
//        String ruleKey = "type";
//        String ruleValue = "phone";
//        int sum=0;
//        for (int i = 0; i < rule.length; i++) {
//
//            if (ruleKey==rule[i]){
//                for (int j = 0; j < items.length; j++) {
//                    if (items[j][i]==ruleValue){
//                        sum++;
//                    }
//                }
//            }
//
//        }
//        if (sum==0){
//            System.out.println("ITEM DOES NOT EXIST");
//        }else{
//            System.out.println(sum);
//        }

// 12. Altitude

//        int[] gain = {-4,-3,-2,-1,4,3,2};
//        int[] alt =new int[gain.length+1];
//        int sum=0;
//
//        for (int i = 0; i < alt.length; i++) {
//            if(i==0){ 
//               alt[i]=0;
//            }else{
//                sum+=gain[i-1];
//                alt[i]=sum;
//            }
//
//        }
//        int max=alt[1];
//        for (int i = 0; i < alt.length; i++) {
//            if(alt[i]>max){
//                max=alt[i];
//            }
//        }
//
//        System.out.println(max);


// 13. FLIPPING AN ARRAY


//        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        int[][] result= new int[image.length][image[0].length];
//        int index=0;
//
//        for (int row = 0; row < image.length; row++) {
//            for (int col = image[row].length-1; col >= 0; col--) {
//                if (image[row][col]==0){
//                    result[row][index]=1;
//                    index++;
//                }else{
//                    result[row][index]=0;
//                    index++;
//                }
//            }
//        index=0;
//
//        }
//
//        for (int[] row : result) {                                              // NEW WAY TO PRINT 2D ARRAY
//            System.out.println(Arrays.toString(row));
//        }


// 14. Cells with odd values..........(RETRY)

//        int mrow=2;
//        int ncol=2;
//        int[][] indices = {{1,1},{0,0}};
//        int[][] result= new int[mrow][ncol];
//
//        for (int row = 0; row < mrow; row++) {
//            int incrow=indices[row][0];
//            int incol=indices[row][1];
//            for (int col = 0; col < ncol; col++) {
//                result[row][col]=0;
////                if(incrow==row){
////                    result[incrow][col]++;
////                }
////                if (incol==col){
////                    result[row][incol]++;
////                }
//                result[incrow][col]++;
//                result[row][incol]++;
//
//            }
//
//        }
//        for (int[] row : result) {                                              // NEW WAY TO PRINT 2D ARRAY
//            System.out.println(Arrays.toString(row));}


// 15. MATRIX DIAGONAL SUM

//        int[][] mat = {{1,1,1,1},
//                       {1,1,1,1},
//                       {1,1,1,1},
//                       {1,1,1,1}};
//        int sum=0;
//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat[row].length; col++) {
//                if (row==col){
//                    sum=sum+mat[row][col];
//                }
//            }
//            for (int col = mat[row].length-1; col >=0 ; col--) {
//                if (row==col){
//                    sum=sum+mat[row][col];
//                }
//
//            }
//
//        }
//        if(mat.length%2!=0){
//            System.out.println(sum-mat[((mat.length+1)/2)-1][((mat.length+1)/2)-1]);
//        }else{
//            System.out.println(sum);
//        }


// 16. EVEN NUMBER OF DIGITS

//        int[] nums = {555,901,482,1771};
//        int sum=0;
//        int even=0;
//        for (int i = 0; i < nums.length; i++) {
//            int j=nums[i]; //pick kia
//            while(j>0){  //no of digits aagaye
//                j=j/10;
//                sum++;
//            }
//            if(sum%2==0){
//                even++;
//            }
//            sum=0;
//
//        }
//        System.out.println(even);

// 17. TRANSPOSE MATRIX


//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] result= new int[matrix[0].length][matrix.length];
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                result[col][row]=matrix[row][col];
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }







    }
}







