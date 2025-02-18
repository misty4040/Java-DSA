package leetcode;

public class Q852 {
    public static void main(String[] args) {
        int[] arr={0,9,5,2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int max=arr[0];
        int i=0;
        int a=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                a=i;
            }

        }
        return a;



    }
}
