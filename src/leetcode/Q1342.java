package leetcode;

public class Q1342 {//14
    public static void main(String[] args){
        System.out.println(numberOfSteps(14));
    }

    private static int numberOfSteps(int n) {
        return recur(n,0);
    }

    private static int recur(int n,int count) {
        if(n==0){
            return count;
        }
        if(n%2 == 0 ){
            n=n/2;
            count++;
        }else{
            n=n-1;
            count++;
        }
        return recur(n,count);
    }


}
