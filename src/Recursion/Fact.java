package Recursion;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n,int fact) {
        if(n==1){
            return fact;
        }

        fact *= n;
        return  factorial(n-1,fact);
    }

    public static int factorial(int n){
        if(n==1){
            return n;
        }

        return n * factorial(n-1);
    }
}
