package leetcode;

public class Q151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i] + " ");
            }
        }
        return sb.toString();
    }
}
