package leetcode;



import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {


        int n=3;
        int[][] arr= Matrix(n);

       for(int[] j:arr){
           System.out.println(Arrays.toString(j));
       }

    }
    static int[][] Matrix(int n){
        int[][] arr= new int[n][n];
        int rs=0,cs=0;
        int re=arr.length-1,ce=arr[0].length-1;
        int count = 1;

        while(rs<=re && cs<=ce){
            if(rs<=re && cs<=ce){
                for(int i=cs;i<=ce;i++){
                    arr[rs][i]=count;
                    count++;
                }
            }
            rs++;
            if(rs<=re && cs<=ce){
                for(int i=rs;i<=re;i++){
                    arr[i][ce]=count;
                    count++;
                }
            }
            ce--;
            if(rs<=re && cs<=ce){
                for(int i=ce;i>=cs;i--){
                    arr[re][i]=count;
                    count++;
                }
            }
            re--;
            if(rs<=re && cs<=ce){
                for(int i=re;i>=rs;i--){
                    arr[i][cs]=count;
                    count++;
                }
            }
            cs++;
        }
        return arr;
    }
}
