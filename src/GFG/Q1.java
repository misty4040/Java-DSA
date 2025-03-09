package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);

    }

    public static List<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer, Integer> count=new HashMap<>();
        List<Integer> dup=new ArrayList<>();

        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        for(var entry: count.entrySet()){
            if(entry.getValue()>1){
                dup.add(entry.getValue());
            }
        }
        return dup;

    }
}
