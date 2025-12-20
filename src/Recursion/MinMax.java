package Recursion;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(findmax(arr,0,0));
    }

    private static int findmax(int[] arr,int max,int i) {
        if(i == arr.length){
            return max;
        }
        if(arr[i] >max){
            max=arr[i];
        }
        return findmax(arr,max,i+1);
    }

}
