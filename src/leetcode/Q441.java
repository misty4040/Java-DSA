package leetcode;

public class Q441 {
    public static void main(String[] args) {//complete rows of coins
        int n=8;
        System.out.println(coin(n));

    }
    static int coin(int n){

        int count=0;
        for(int i=1;i<=n;i++){
            count=i;
          n-=i;
        }
        return count;


        }
    }

