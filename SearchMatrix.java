package Grind75;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int row = 0; row < matrix.length; row++) {
            if (search(matrix[row],target)){
                return true;
            }
        }
        return false;

    }

    private boolean search (int[] arr, int tgt){
        int s= 0 ;
        int e=arr.length-1;
        while (s<=e){
            int mid = s+((e-s)/2);

            if (arr[mid]==tgt){
                return true;
            } else if (arr[mid]>tgt) {
                e = mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
    }
}
