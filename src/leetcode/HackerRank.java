package leetcode;

public class HackerRank {
    public static void main(String[] args) {
        int[][] arr={
                {1 ,1, 1,0,0,0},
                {0 ,1 ,0 ,0 ,0 ,0 },
                {1 ,1 ,1 ,0 ,0 , 0},
                {0 ,0 ,2 ,4 ,4 ,0},
                {0 ,0 ,0 ,2 ,0 ,0},
                {0 ,0 ,1 ,2 ,4 ,0}
        };

        print(arr);
    }

    static void print(int[][] arr ){
        int sum=0;
        int a=0,b=0;
        int max=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]
                +arr[i+1][j+1]
                +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];


                if(sum>max){
                    max=sum;
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(a);
        System.out.println(b);
        for(int i=a;i<6;i++){
            for(int j=b;j<6;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
