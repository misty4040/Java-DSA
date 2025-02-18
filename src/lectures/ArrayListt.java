package lectures;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListt {//it doesnt  need size
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(60);
        arr.add(70);
        arr.add(80);

        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }
        arr.set(3,77);
        arr.remove(3);
        for(int i=0;i<5;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //or
        System.out.print(arr+" ");
    }

}
//10 20 30 40 50