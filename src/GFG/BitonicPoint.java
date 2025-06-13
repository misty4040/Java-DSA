package GFG;

public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(findMaximum(arr));
    }

    private static int findMaximum(int[] arr) {

        return recur(1,0,0,arr);


    }

    private static int recur(int i, int j,int max,int[] arr) {
        if(arr[i]<arr[j]){
            return max;
        }
        if(arr[i]>arr[j]){
            max=arr[i];
        }
        return recur(i+1,j+1,max,arr);

    }
}
