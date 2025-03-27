package leetcode;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int res=lengthOfLastWord(s);
        System.out.println(res);
    }

    static int lengthOfLastWord(String s){
        String news=s.trim();
        int index=news.lastIndexOf(" ");
        int count=0;
        for(int i=index+1;i<news.length();i++){
            count++;
        }
        return count;
    }
}
