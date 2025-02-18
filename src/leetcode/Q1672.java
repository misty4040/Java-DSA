package leetcode;

public class Q1672 {
    public static void main(String[] args) {//maximum wealth
        int[][] accounts={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maxwealth(accounts));

    }
    static int maxwealth(int[][] accounts){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];


            }
            if(sum>=max)
                max=sum;

        }
        return max;


    }
}
