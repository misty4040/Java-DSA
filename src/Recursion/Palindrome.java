package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcddcba";

        System.out.println(check(s, 0, s.length() - 1));
    }

    private static boolean check(String n, int start, int end) {
        if (start > end) {
            return true;
        }

        if(n.charAt(start)==(n.charAt(end))){
            return check(n,start+1,end-1);
        }
        return false;
    }




    private static boolean check(int n, int num, int org) {

        if (n == 0) {
            if (num == org) {
                return true;
            } else {
                return false;
            }
        }
        int rem = n % 10;
        num = num * 10 + rem;
        return check(n / 10, num, org);

    }
}


