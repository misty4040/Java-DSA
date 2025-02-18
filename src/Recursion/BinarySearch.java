package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []  nums={24,56,87,93,100};
        System.out.println(sort(nums,93,0,nums.length-1));
    }
    static int sort(int [] nums,int target,int s,int e){
        if(s>e){
            return -1;

        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return sort(nums,target,0,mid-1);
        }
        return sort(nums,target,mid+1,e);
    }
}
