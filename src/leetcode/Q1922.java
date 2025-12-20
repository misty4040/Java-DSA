package leetcode;

public class Q1922 {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
static long MOD = 1000000007;
    private static int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long e = modpow(5,even);
        long o = modpow(4,odd);

        return (int)((e*o) % MOD);
    }

    private static long modpow(long base, long exp) {
        long ans = 1;
        base %= MOD;

        while(exp > 0){
            if(exp%2 == 1){
                ans = (ans*base) % MOD;
            }

            base = (base * base) % MOD;
            exp /= 2;
        }
        return ans;
    }
}
