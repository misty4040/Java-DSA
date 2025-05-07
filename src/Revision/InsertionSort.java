package Revision;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,2,4,7,9,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=max(arr,last);
            swap(arr,last,max);
        }
        return arr;
    }

    static int max(int[] arr,int last){
        int max=0;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static  void swap(int[] arr, int last,int max){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]= temp;
    }
}
