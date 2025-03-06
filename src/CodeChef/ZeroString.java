package CodeChef;
import java.util.*;
import java.lang.*;

public class ZeroString {
   public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while(t-- >0){
                int n=in.nextInt();
                in.nextLine();
                String s=in.nextLine();


                int count=0;
                for(int i=0;i<n;i++){
                    char ch=s.charAt(i);
                    if(ch=='1'){
                        count++;
                    }


                }
                if(count==0){
                    System.out.println(0);
                }else{
                    System.out.println(Math.min(count, 1 + (n - count)));

                }

            }
        }
    }


