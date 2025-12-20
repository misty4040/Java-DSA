package DSA;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        System.out.println(maxSum(arr,3));
    }

    private static int maxSum(int[] arr, int k) {
        int sum=0,maxs=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        maxs = sum;

        for(int i=k;i<arr.length;i++){
            sum+=arr[i] - arr[i-k];
            maxs = Math.max(maxs,sum);
        }
        return maxs;
    }
}
