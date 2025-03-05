package CodeChef;
import java.util.*;
import java.lang.*;

public class EventualReduction {


    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while(t-- >0){
                int n=in.nextInt();
                in.nextLine();
                String s=in.nextLine();
                HashMap<Character,Integer> map=new HashMap<>();
                for(char ch: s.toCharArray()){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }

                boolean res=true;
                for(var entry: map.entrySet()){
                    if(entry.getValue() % 2==1){
                        res=false;
                    }
                }

                if(res){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }
    }

}
