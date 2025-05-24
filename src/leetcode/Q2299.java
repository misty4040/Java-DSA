package leetcode;

public class Q2299 {
    public static void main(String[] args) {
        String password = "IloveLe3tcode!";
        System.out.println(strongPasswordCheckerII(password));
    }

    private static boolean strongPasswordCheckerII(String password) {
        boolean small=false,large=false,digit=false,special=false;
        char cont = ' ';
        String word = "!@#$%^&*()-+";
        if(password.length()>=8){
            char[] ch = password.toCharArray();
            for(int i=0;i<password.length();i++){
                if(ch[i] == cont){
                    return false;
                }
                cont=ch[i];
                if(ch[i] >='a' && ch[i] <='z'){
                    small=true;
                }
                if(ch[i] >= 'A' && ch[i] <= 'Z'){
                    large=true;
                }
                if(Character.isDigit(ch[i])){
                    digit=true;
                }
                if(word.indexOf(ch[i]) != -1 ){
                    special=true;
                }
            }
            return small && large && digit && special;

        }
    return false;
    }
}
