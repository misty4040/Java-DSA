package leetcode;

import java.util.Stack;

public class Q2696 {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }

    private static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(ch[i]);
            }else if((ch[i] == 'B' && stack.peek() == 'A') || (ch[i] == 'D' && stack.peek() == 'C')){
                stack.pop();
            }else{
                stack.push(ch[i]);
            }

        }
        return stack.size();
    }
}
