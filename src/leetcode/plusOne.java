package leetcode;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] res=plusOne(digits);
        System.out.println(Arrays.toString(res));
    }

    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] newdig=new int[n+1];
        newdig[0]=1;
        return newdig;
    }
}
