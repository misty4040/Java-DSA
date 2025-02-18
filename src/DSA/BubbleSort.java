package DSA;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,8,1,3,5};
        System.out.println(Arrays.toString(sort(arr)));
    }


    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swap=true;
                }
            }
            if(!swap){
                break;
            }

        }

        return arr;
    }

        static void swap ( int[] arr, int j, int i){
            int temp = arr[j-1];
            arr[j - 1] = arr[j];
            arr[j] = temp;

        }

}
