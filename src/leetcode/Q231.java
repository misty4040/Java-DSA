package leetcode;

import static java.lang.Math.pow;

public class Q231 {
    public static void main(String[] args) {
       int n = 2147483646;
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        if(n==1 || n%2==0){
            for(int i=0;i<=n/2;i++){
                if(n==java.lang.Math.pow(2,i)){
                    return true;
                }
            }
        }
        return false;
    }
}
