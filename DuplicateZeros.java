package Grind75;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;

        int i = n - 1;
        int j = n - 1;

        while (i >= 0) {
            if (arr[j] == 0) {
                if (i < n) arr[i] = 0;
                i--;
                if (i < n) arr[i] = 0;
                i--;
            } else {
                if (i < n) arr[i] = arr[j];
                i--;
            }
            j--;
        }
    }
}
