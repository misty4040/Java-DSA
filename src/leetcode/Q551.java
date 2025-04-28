package leetcode;

import java.util.HashMap;

public class Q551 {
    public static void main(String[] args) {
        String s = "PPALLP";
        boolean res=checkRecord(s);
        System.out.println(res);
    }

    private static boolean checkRecord(String s) {

        char[] ch=s.toCharArray();
        int counta=0;
        int countl=0;
        int check=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'){
                counta++;

                if(counta>2){
                    check=1;
                    break;
                }
            }

            if(ch[i]=='L'){
                countl++;

                if(countl>=3){
                    check=1;
                    break;
                }
            }else{
                countl=0;
            }

        }

        if(check==1){
            return false;
        }
        return true;
    }

}
