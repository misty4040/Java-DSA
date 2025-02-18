package Recursion;

import java.util.ArrayList;

public class LinearSearchIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6};
//        search(arr,0,3);
//        System.out.println(list);
        System.out.println(search(arr,0,3,new ArrayList<>()));
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void search(int[] arr,int i, int target){
        if(i==arr.length){
            return;
        }

        if(target==arr[i]) {
            list.add(i);
        }
        search(arr,i+1,target);
    }

    //arraylist used inside the method
    static ArrayList<Integer> search(int[] arr,int i,int target,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }

        if(target==arr[i]){
            list.add(i);
        }
        return search(arr,i+1,target,list);
    }
}
