package leetcode;

import java.util.HashMap;

public class Q2283 {
    public static void main(String[] args) {
        String  num = "1210";
        System.out.println(digitCount(num));
    }

    private static boolean digitCount(String num) {
      int[] count = new int[10];

      for(char ch : num.toCharArray()){
          count[ch-'0']++;
      }

      for(int i=0;i<num.length();i++){
          int n =num.charAt(i)-'0';
          if(i!=n){
              return false;
          }
      }
      return true;
    }
}
