package Grind75;

public class MergeSorted {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                arr[k++] = nums2[j++];
            } else { // nums1[i] == nums2[j]
                arr[k++] = nums1[i];
                arr[k++] = nums2[j];
                i++;
                j++;
            }
        }
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }

        for (int l = 0; l < m + n; l++) {
            nums1[l] = arr[l];
        }

    }
}
