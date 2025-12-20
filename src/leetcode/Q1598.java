package leetcode;

import java.util.Stack;

public class Q1598 {
    public static void main(String[] args) {
        String[] logs = {"./","../","./"};
        System.out.println(minOperations(logs));
    }

    private static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if((!stack.isEmpty()) && logs[i].equals("../")){
                stack.pop();
            } else if (logs[i].equals("./")) {
                continue;
            }else if(!logs[i].equals("../") && !logs[i].equals("./")){
                stack.push(logs[i]);
            }
        }
        return stack.size();
    }
}
