package leetcode;

public class Q1342 {//14
    public static void main(String[] args) {//6
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num){
        return helper(num,0);
    }

    static int helper(int n, int c) {
        if(n==0){
            return c;
        }

        if(n%2==0){
            return helper(n/2,c+1);

        }else{
            return helper(n-1,c+1);
        }
    }
}
