package Revision;

public class ExceptionQ {
    public static void main(String[] args) {
        String name="anvc";
        try{
          int n=Integer.parseInt(name);
            System.out.println(n );
        }catch(ArithmeticException e){
            System.out.println("cant be divided by zero");
        }catch(NumberFormatException e){
            System.out.println("invalid num formt");
        }
    }
}
