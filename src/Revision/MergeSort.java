package Revision;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergesort(new int[]{5, 4, 3, 2, 1})));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merged(left,right);
    }

    private static int[] merged(int[] left, int[] right) {
        int[] arr = new int[left.length+right.length];
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i<left.length){
            arr[k++] = left[i++];
        }

        while (j<right.length){
            arr[k++] = right[j++];
        }

        return arr;
    }
}
