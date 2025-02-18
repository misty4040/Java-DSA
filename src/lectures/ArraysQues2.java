package lectures;
import java.util.Arrays;
public class ArraysQues2 {//reverse of array
    public static void main(String[] args) {
        int[] arr={1,5,7,89};
        int a=arr.length - 1;
   //  int temp=arr[0];
//        arr[0]=arr[a];
//        arr[a]=temp;
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
            a--;

        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
