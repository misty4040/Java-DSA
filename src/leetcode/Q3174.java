package leetcode;

import java.util.Stack;

public class Q3174 {
    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
    }

    private static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(ch[i])){
                stack.push(ch[i]);
            }else{
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
