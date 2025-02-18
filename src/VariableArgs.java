import java.util.Arrays;
import java.util.Scanner;
public class VariableArgs {
    public static void main(String[] args) {
//      args(7,8,9);
        Scanner input= new Scanner(System.in);
        double a=input.nextDouble();
        float b=input.nextFloat();
        System.out.println(a+b);
    }
    static void args(int ...n){
        System.out.println(Arrays.toString(n));
    }
}
