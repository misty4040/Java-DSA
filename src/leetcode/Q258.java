package leetcode;

public class Q258 {
    public static void main(String[] args) {
        int num=38;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        int sum=num;
        int res=0;
        while(true){
            res=0;
            while(sum!=0){
               res += sum%10;
                sum=sum/10;
            }

            if(res<10){
                break;
            }
           sum=res;
        }
        return res;
    }
}
