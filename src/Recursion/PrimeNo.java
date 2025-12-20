package Recursion;

public class PrimeNo {
    public static void main(String[] args) {
        int n=11;
        System.out.println(Prime(n,2,0));
    }

    private static String Prime(int n,int i,int count) {
       if(i>n/2){
           return "yes";
       }

        if(n%i == 0) {
            return "no";
        }

        return  Prime(n,i+1,count);
    }
}
