package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q412 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fizzBuzz(n));
    }

    private static List<String> fizzBuzz(int n) {

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            } else if (i%3==0) {
                arr.add("Fizz");
            }else if (i%5==0){
                arr.add("Buzz");
            }else{
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }
}
