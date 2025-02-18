import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input= new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        max(a,b,c);
        min(a,b,c);


    }
    static void max(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println("a is greater");
        } else if (b>c&&b>a) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
    static void min(int a,int b,int c){
        if(a<b&&a<c){
            System.out.println("a is smaller");
        } else if (b<c&&b<a) {
            System.out.println("b is smaller");

        }
        else{
            System.out.println("c is smaller");
        }
    }
}
