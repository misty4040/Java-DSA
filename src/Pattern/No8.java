package Pattern;//down triangle

public class No8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for(int i=0;i<n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("* ");//space diff
            }

            System.out.println();
        }

    }
}
