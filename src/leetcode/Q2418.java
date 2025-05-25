package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Q2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,String> map = new HashMap<>();
        String[] res = new String[heights.length];

        for(int i=0;i<heights.length;i++){
            queue.add(heights[i]);
        }

        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }

        for(int i=0;i<heights.length;i++){
            res[i]=map.get(queue.poll());
        }

        return  res;
    }
}
