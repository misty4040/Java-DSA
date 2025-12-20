package GFG;

import java.util.Arrays;

public class FindKthRotation {
    public static void main(String[] args) {
        int[] arr = {6,9,2,4};
        System.out.println(findKRotation(arr));
    }

    private static int findKRotation(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

}
