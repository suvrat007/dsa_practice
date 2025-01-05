package Revision;


import java.util.Arrays;

public class revSorting {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        instertionSort(arr);
    }

    static int binarySearch(int arr[], int tgt) {
        // to be done when array is sorted
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end - start / 2;

        while (start < end) {
            if (arr[mid] == tgt) {
                return arr[mid];
            } else if (arr[mid] > tgt) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //wrap around wala case
        return arr[start % arr.length];
    }

    static void selectionSort(int[] arr) {
        // find the maximum number in the array and put in the last....while reducing the size of array to work on qki last se array sort ho hi rahi hai so u dont need to check it again
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            // swap
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // compare next to each element and keep swapping....it will send the largest one to the end after every iteration of the outer loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void instertionSort(int[] arr) {
        // compare parts of array and keeps engulfing new element with each iteration and compares and throws the new element in the right place and breaks from loop coz usse pehle ka sorted hai
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap if previous is greater in array
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
//                }else {
//                    //if not small then break...qki rest array is sorted
//                    break;
//                }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
//        static void cyclicSort (int[] arr){
//
//            //check if array[i] is at correct place or not i+1....if not then swap to correct place
//            int i = 0;
//            while (i < arr.length) {
//                int correct = arr[i] - 1; // correct index value
//                if (arr[correct] != arr[i]) {
//                    //swap
//                    int temp = arr[correct];
//                    arr[correct] = arr[i];
//                    arr[i] = temp;
//
//                } else {
//                    i++;
//                }
//
//            }
//            System.out.println(Arrays.toString(arr));
//
//
//        }

    }
}