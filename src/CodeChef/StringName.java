package CodeChef;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            in.nextLine();
            String s = in.next();

            boolean zalatan =true;
            boolean ramos = false;
           while (s.length() >= 2){
               if(s.charAt(0) != s.charAt(1)){
                   s = s.substring(2);
                   zalatan = !zalatan;
                   ramos = !ramos;
               }else{
                   s = s.substring(2);
               }
           }

           if(zalatan == false){
               System.out.println("zalatan");
           }else{
               System.out.println("ramos");
           }

        }
    }
}
