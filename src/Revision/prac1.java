package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prac1 {
    public static void main(String[] args) {
        String s =  "enjoyyourcoffee"; //"enj||o||y||your||coffee";
        List<Integer> list = Arrays.asList(3,4,5,9);
        System.out.println(spaces(s,list));
    }

    private static String spaces(String s, List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        int prev =0;
        for(int j=0;j<list.size();j++) {
            for (int i = prev; i < list.get(j); i++) {
                sb.append(s.charAt(i));
                prev =i+1;
            }
            sb.append(" ");
        }

        for (int i = prev; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
