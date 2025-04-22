package Revision;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,8,3,7,5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int j ,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
