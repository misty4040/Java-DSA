package string;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        String name = "Misty";
        String vowels = "AEIOUaeiou";
        int vowel = 0, consonant =0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(vowels.indexOf(ch) == -1){
                consonant++;
            }else{
                vowel++;
            }
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }
}
