package leetcode;

public class Q7 {
    public static void main(String[] args) {
int x=120;
        System.out.println(reverse(x));
    }

    static int reverse(int x){
        int rem=0;
        int rev=0;

        if(x>0){
            while(x!=0){
                rem=x%10;
                rev=rev*10+rem;
                x/=10;

            }return rev;

        }
        else{
            int pos= -x;
            while(pos>0){
                rem=pos%10;
                rev=rev*10+rem;
                pos/=10;

            }return -rev;
        }

    }
}
