package leetcode;

public class Q2278 {
    public static void main(String[] args) {
        String  s = "foobar";
        char letter = 'o';
        int res=percentageLetter(s,letter);
        System.out.println(res);
    }

    private static int percentageLetter(String s, char letter) {
        int n = s.length();
        int count=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }

        return (count * 100)/n;
    }
}
