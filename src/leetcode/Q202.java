package leetcode;

public class Q202 {
    public static void main(String[] args) {
        int n=86;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {

        if(n==1 || n==7){
            return true;
        }
        if(n!=1 && n!=7 && n<9){
            return false;
        }
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return isHappy(sum);
    }


}
