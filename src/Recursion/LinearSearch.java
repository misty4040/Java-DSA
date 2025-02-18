package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,1,8,6};
        System.out.println(search(arr,0,8));
    }

    static int search(int[] arr,int i,int target){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }else{
            return search(arr,i+1,target);
        }
    }
}
