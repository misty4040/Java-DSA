package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,5,1,4,3};//
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int correct=arr[i]-1;//0 to n mein 0 minus hoga
            //similarly 1 to me 1 minus hoga
            //3 to n mein 3 minus hoga;
            if(arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
        }
    }

    static void swap(int[] arr, int correct, int i) {
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }
}
