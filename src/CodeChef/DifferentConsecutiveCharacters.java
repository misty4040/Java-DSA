package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class DifferentConsecutiveCharacters {


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while(t-- >0){
                int n=in.nextInt();
                String s=in.next();
                int count=0;
                for(int i=0;i<n-1;i++){
                    if(s.charAt(i)==s.charAt(i+1)){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }
    }


