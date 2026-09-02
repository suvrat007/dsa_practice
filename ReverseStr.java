package Grind75;

public class ReverseStr {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i+=2*k) {

            int right = Math.min(i + k - 1, arr.length - 1);
            int left = i;

            while (left<right){
                // swap left and right elements
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
