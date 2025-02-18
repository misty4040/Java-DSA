package lectures;

public class ArraysQues {//largest of all
    public static void main(String[] args) {
        int[] arr={1,7,3,8,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
