package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }

    private static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums3){
            set3.add(i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int j=0;
       for(int i:set1){
           arr.add(i);
       }
        for(int i:set2){
            arr.add(i);
        }
        for(int i:set3){
            arr.add(i);
        }//1 2 3 2 3 3

        int[] count = new int[101];

        for(int i=0;i< arr.size();i++){
            count[arr.get(i)]++;
        }

        for(int i=0;i<arr.size();i++){
            if(count[arr.get(i)]>1){
                arr2.add(arr.get(i));
            }
        }

        HashSet<Integer> map = new HashSet<>();
        for(int i: arr2){
            map.add(i);
        }
        ArrayList<Integer> var = new ArrayList<>();
        for(int i: map){
            var.add(i);
        }
        return  var;
    }
}
