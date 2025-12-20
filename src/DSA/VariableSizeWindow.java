package DSA;

public class VariableSizeWindow {
    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        System.out.println(findmin(arr,7));
    }

    private static int findmin(int[] arr, int target) {
        int start = 0 ;
        int sum = 0;
        int mins = Integer.MAX_VALUE;
        for(int end =0;end<arr.length;end++){
            sum+=arr[end];

            while(sum >= target){
                mins = Math.min(mins,(end - start) + 1);
                sum-=arr[start++];
            }
        }
        return mins;
    }
}
