package Revision;

import java.util.Stack;

public class StackQyestion {
    public static void main(String[] args) {
        String s="ab#cdef##";
        String res=Ques(s);
        System.out.println(res);
    }

    public static String Ques(String s){
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<ch.length;i++){
            if(ch[i]!='#'){
               stack.push(ch[i]);
            }else{
                stack.pop();
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();

    }
}
