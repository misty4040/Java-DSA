package leetcode;

public class q1295 {
    public static void main(String[] args) {
      int[] num={437,315,322,431,686,264,442};
        System.out.println(find(num));
    }
    static int find(int[] num){

        int count=0;
        int ans=0;
        for(int i=0;i<num.length;i++){
            count=0;
           while(num[i]!=0){
               num[i]/=10;
               count++;


           }
           if(count%2==0){
               ans++;


           }

        }return ans;



    }
}
