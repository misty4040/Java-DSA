package leetcode;

public class Q2001 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }

    private static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s : operations){
            if(s.equals("--X") || s.equals("X--") ){
                x--;
            }else{
                x++;
            }
        }
       return x;
    }
}
