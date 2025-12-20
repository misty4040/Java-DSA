package leetcode;

public class Q771 {
    public static void main(String[] args) {
        String jewels ="aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
                if(jewels.indexOf(stones.charAt(i)) != -1){
                    count++;
                }
            }

        return count;
    }
}
