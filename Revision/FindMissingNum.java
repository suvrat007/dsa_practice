package Revision;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr={2,1,4,3};
        System.out.println(missing(arr));

    }
    static int missing(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correct]  ) {
                //swap
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
}
