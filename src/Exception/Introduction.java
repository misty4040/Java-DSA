package Exception;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {

        try {
            int misty = 900;

            if(misty < 1000){
                throw new IllegalArgumentException("aur paise de");
            }

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ye toh hai hi nhi");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }
}
