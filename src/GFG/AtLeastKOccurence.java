package GFG;

import java.util.HashMap;

public class AtLeastKOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(arr,2));
    }

    private static int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) == k){
                return i;
            }
        }
        return -1;
    }
}
