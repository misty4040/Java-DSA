package leetcode;

public class CheckBalancedString {
    public static void main(String[] args) {
        String num="12345";
        boolean res=isBalanced(num);
        System.out.println(res);
    }

    private static boolean isBalanced(String num) {
        int even=0,odd=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                even+=digit;
            }else{
                odd+=digit;
            }
        }


        if(even==odd){
            return true;
        }
        return false;
    }
}
