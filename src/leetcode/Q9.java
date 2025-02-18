package leetcode;

public class Q9 {
    public static void main(String[] args) {
        int x=-121;
        System.out.println(check(x));
    }
    static boolean check(int x){
        int rem=0;
        int res=0;
        int real=x;
        while(x>0){
            rem=x%10;
            res=res*10+rem;
            x/=10;
        }
        if(res==real) {
            return true;
        }
return false;
    }


}

