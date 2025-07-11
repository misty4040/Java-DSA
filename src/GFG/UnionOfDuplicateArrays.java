package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfDuplicateArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        int[] b ={3,2,2,3,3,2};
        System.out.println(findUnion(a,b));
    }

    private static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:a) {
            arr.add(i);
        }
        for(int i:b) {
            arr.add(i);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i:set){
            list.add(i);
        }

       return list;

    }
}
