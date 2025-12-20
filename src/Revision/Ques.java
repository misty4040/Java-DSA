package Revision;

import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        int j=0,k=0;
        for(int i=0;i<arr1.length;i++){
            if(arr2[j]>arr1[i]){
                arr3[k++] = arr1[i];
            }else{
                arr3[k++] = arr2[j++];
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(arr2[j]<arr1[i]){
                arr3[k++] = arr2[j++];
            }
        }

        return arr3;
    }
}
