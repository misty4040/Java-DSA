package lectures;

public class Count {
    public static void main(String[] args) {
        int a=123;
        int count=0;
        int rem=0;
        while(a!=0){
           rem= a%10;
           count++;
           a/=10;
        }
        System.out.println(count);
    }


}
