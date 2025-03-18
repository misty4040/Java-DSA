package GFG;

import java.util.Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int res=missingNumber( arr);
        System.out.println(res);
    }

    private static int missingNumber(int[] arr) {
        int n=arr.length;
        int ans=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
               return i+1;
            }
        }
        return arr.length+1;
    }

}
