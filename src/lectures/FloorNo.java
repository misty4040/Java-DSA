package lectures;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr={2,4,7,9,14,17,19,25};
        int target=15;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];
    }
}
