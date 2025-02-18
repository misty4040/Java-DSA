package Pattern;

public class Revision {
    public static void main(String[] args) {
        print(4);
    }

    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
