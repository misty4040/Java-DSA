import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a;
        a=input.nextInt();

        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

    }

}
