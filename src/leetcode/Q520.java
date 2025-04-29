package leetcode;

public class Q520 {
    public static void main(String[] args) {
        String word = "USA";
        boolean res=detectCapitalUse(word);
        System.out.println(res);
    }

    private static boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase())){
           return true;
       }

       if(word.equals(word.toLowerCase())){
           return true;
       }

        if (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase())) return true;

        return false;
    }
}
