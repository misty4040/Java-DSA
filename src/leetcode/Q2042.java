package leetcode;

public class Q2042 {
    public static void main(String[] args) {
        String  s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(areNumbersAscending(s));
    }

    private static boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int n,res=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i].charAt(0))){
                n=Integer.parseInt(arr[i]);
                if(n<=res){
                    return false;
                }
                res=n;
            }
        }
        return true;
    }
}
