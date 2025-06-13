package Recursion;

import java.util.ArrayList;

public class LinearSearchRecur {
    public static void main(String[] args) {
        int[] arr ={1,2,4,7,5,7,7,9};
        System.out.println(stored(arr,7,0,new ArrayList<>()));
    }



    private static ArrayList<Integer> stored(int[] arr, int i, int start,ArrayList<Integer> list) {

        if(start == arr.length){
            return list;
        }

        if(arr[start] == i){
            list.add(start);
        }

        return stored(arr,i,start+1,list);
    }

    private static String find(int[] arr, int i,int start) {
        if(start == arr.length){
            return "not found";
        }

        if(arr[start] == i){
            return "found";
        }

        return find(arr,i,start+1);

    }


}
