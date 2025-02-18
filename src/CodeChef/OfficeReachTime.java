package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OfficeReachTime {


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();


            while(t-- > 0){
                int x=in.nextInt();
                if(x>=30){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
}
