import java.util.Scanner;
public class VoteEligible {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        vote(a);
    }
    static void vote(int a){
        if (a>=18)
            System.out.println("eligible");
        else
            System.out.println("not eligible");
    }

}
