package string;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "ABAB";
        System.out.println(gcd(s1,s2));
    }

    private static String gcd(String s1, String s2) {
        if(!(s1+s2).equals(s2+s1)){
            return "";
        }

         int n = gcdlen(s1.length(),s2.length());
        return s1.substring(0,n);
    }

    private static int gcdlen(int l1, int l2) {
        while(l2!=0){
           int temp = l2;
           l2=l1%l2;
           l1 = temp;
        }
        return l1;
    }
}
