package leetcode;

public class Q2678 {
    public static void main(String[] args) {
        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        System.out.println(countSeniors(details));
    }

    private static int countSeniors(String[] details) {
       String res;
      int count =0;
      for(int i=0;i<details.length;i++) {
          res=details[i];
          if(res.charAt(11) > '6' || (res.charAt(11) == '6' && res.charAt(12)>'0') ){
              count++;
          }
      }
      return count;
    }
}
