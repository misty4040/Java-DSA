package CodeChef;

import java.util.Scanner;
import java.util.Stack;

public class ReversingDirections {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-- >0){
            Stack<String> direc = new Stack<>();
            Stack<String> rest = new Stack<>();
            int n=in.nextInt();
            in.nextLine();
            for(int i=0;i<n;i++){
                String s=in.nextLine();
                if(s.startsWith("Begin") || s.startsWith("Right")){
                    direc.push(s.substring(0,5));
                    rest.push(s.substring(5));
                }else{
                    direc.push(s.substring(0,4));
                    rest.push(s.substring(4));
                }
            }
            System.out.print("Begin");
            System.out.println(rest.pop());

            for(int i=0;i<n-1;i++) {
                if (direc.peek().equals("Left")) {
                    System.out.print("Right");
                    direc.pop();
                    System.out.println(rest.pop());
                } else {
                    System.out.print("Left");
                    direc.pop();
                    System.out.println(rest.pop());
                }
            }

        }
    }
}
