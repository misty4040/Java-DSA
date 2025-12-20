package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop() , num);
            }
            stack.push(num);
        }
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i] = map.getOrDefault(nums1[i] , -1);
        }
return arr;
    }
}
