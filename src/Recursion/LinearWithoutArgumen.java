package Recursion;

import java.util.ArrayList;

public class LinearWithoutArgumen {
    public static void main(String[] args) {
        int[] arr ={1,2,4,7,5,7,7,9};
        System.out.println(stored(arr,7,0));
    }

    private static ArrayList<Integer> stored(int[] arr, int i, int start) {
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }

        if(arr[start] == i){
            list.add(start);
        }

        ArrayList<Integer> ans = stored(arr,i,start+1);

        list.addAll(ans);
        return list;
    }
}
