package leetcode;

public class Q941 {
    public static void main(String[] args) {
        int[] arr={2,1};
        boolean res=validMountainArray(arr);
        System.out.println(res);
    }

    private static boolean validMountainArray(int[] arr) {
        if(arr.length<=3){
            return false;
        }
        int n=arr.length;

        int i=0;

        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }

        if(i==0 || i==arr.length-1){
            return false;
        }

        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
}
