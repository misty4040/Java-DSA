package leetcode;

import java.util.*;

public class Q506 {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    private static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        for(int i : score){
            queue.add(i);
        }

        HashMap<Integer,String> map = new HashMap<>();

        for(int i=0;i<score.length;i++){
            int n=queue.poll();
            if(i<3){
                map.put(n,medals[i]);
            }else{
                map.put(n,String.valueOf(i+1));
            }
        }

        String[] res = new String[score.length];
        for(int i=0;i<score.length;i++){
            res[i] = map.get(score[i]);
        }
        return res;
    }
}
