package GFG;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr ={16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

    private static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            boolean ans = false;
//            for(int j=i+1;j<arr.length;j++){
//               if(arr[j]>arr[i]){
//                   ans=true;
//                   break;
//               }
//            }
//            if(!ans){
//                list.add(arr[i]);
//            }
//        }
//        return list;

        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<arr.length-1;i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            if (arr[i + 1] > arr[i]) {
                stack.pop();
            }
        }

         return list;
    }
}
