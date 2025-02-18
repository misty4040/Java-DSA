package lectures;
import java.util.Arrays;
import java.util.Scanner;
public class Array2{
    public static void main(String[] args) {
        //declaration method1
        //int[] arr={1,2,3,4,5};
        //printing
        //System.out.println(Arrays.toString(arr));
        //declaration method2
        int[] arr= new int[5];
        Scanner input=new Scanner(System.in);
        //input
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        //printing
        for(int i:arr){
            System.out.println(i);
        }

    }
}