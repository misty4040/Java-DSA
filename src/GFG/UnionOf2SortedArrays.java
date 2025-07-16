package GFG;

import Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a={-7,8};
        int[] b={-8,-3,8};
        System.out.println(findUnion(a,b));
    }

    private static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i:b){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: map.keySet()){
            arr.add(i);
        }
        Collections.sort(arr);
        return arr;


    }

}
