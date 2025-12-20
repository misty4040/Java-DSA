package Recursion;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println(removeapp("acdeappgh",""));
    }

    private static String removeapp(String s, String p) {
        if(s.isEmpty()){
            return p;
        }

        char ch =s.charAt(0);

        if(s.startsWith("app")){
            if(!s.startsWith("apple")){
                return removeapp(s.substring(3),p);
            }else{
                return removeapp(s.substring(5),p+"apple");
            }
        }else{
            return removeapp(s.substring(1),p+ch);
        }

    }
}
