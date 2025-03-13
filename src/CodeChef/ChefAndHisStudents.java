package CodeChef;
import java.util.*;
import java.lang.*;
//import java.io.*;
public class ChefAndHisStudents {


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            int testcases=in.nextInt();
            while(testcases-- >0){
                String s=in.next();
                int count=0;
                for(int i=0;i<s.length()-1;i++){
                    if(s.charAt(i) == '<' && s.charAt(i+1)== '>' ){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }

