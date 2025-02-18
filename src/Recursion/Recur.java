package Recursion;

public class Recur {
    public static void main(String[] args) {
        System.out.println(count(30002));
    }
//factorial n=5
    static int fact(int n){
        if(n<=1){
            return 1;
        }

        return n* fact(n-1);
    }
//sum n=5
        static int sum(int n) {
            if (n==1) {
            return 1;
            }

            return n + sum(n-1);
        }
//product n=12345
        static int product(int n){
        if(n==0){
            return 1;
        }

        return (n%10) * product(n/10);

        }
// count n=3002
        static int count(int n){
        return helper(n,0);

        }

    static int helper(int n, int c) {
        if(n==0){
            return c;
        }

        if(n%10==0) {
            return helper(n / 10, c + 1);
        }else{
            return helper(n/10,c);
        }
    }
}
