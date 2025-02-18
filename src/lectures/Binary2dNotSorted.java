package lectures;

import java.util.Arrays;

public class Binary2dNotSorted {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(BinarySearch(arr,1)));

    }
    static int[] BinarySearch(int[][] arr,int target){
        int rs=0,re=arr.length-1;
        int cs=0,ce=arr[0].length-1;
        int cm=cs+(ce-cs)/2;
        while(rs<(re-1)){
            int mid=rs+(re-rs)/2;
            if(arr[mid][cm]<target){
                rs=mid;
            }
            else{
                re=mid;
            }
        }
        if(arr[rs][cs]<=target && arr[rs][ce]>=target){
            return BinarySearch(arr,rs,cs,ce,target);
        }
        else{
            return BinarySearch(arr,rs+1,cs,ce,target);
        }


    }

    static int[] BinarySearch(int[][] arr, int rs, int cs, int ce, int target) {
        while(cs<=ce){
            int mid=cs+(ce-cs)/2;
            if(target==arr[rs][mid]){
                return new int[] {rs,mid};
            }
            if(target>arr[rs][mid]){
                    cs=mid+1;
            }
            else{
                ce=mid-1;
            }

        }
        return new  int[] {-1,-1};
    }
}
