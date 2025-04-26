package leetcode;

public class Q2315 {
    public static void main(String[] args) {
        String s =  "yo|uar|e**|b|e***au|tifu|l";
        int res=countAsterisks(s);
        System.out.println(res);
    }

    private static int countAsterisks(String s) {
        int pipe=0;
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='|'){
                pipe++;
            }

            if(pipe%2==0){
                if(ch[i]=='*'){
                    count++;
                }
            }
        }
        return count;
    }
}
