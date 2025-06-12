package leetcode;

public class Q2103 {
    public static void main(String[] args) {
        String rings = "G4";
        System.out.println(countPoints(rings));
    }

    private static int countPoints(String rings) {
        int start = 0;
        int end = 1;
        int [] red = new int[10];
        int [] blue = new int[10];
        int [] green = new int[10];

        char[] ch = rings.toCharArray();
        while(end<ch.length){
            if(ch[start] == 'R'){
                red[ch[end] - '0']++;
            }else if(ch[start] == 'B'){
                blue[ch[end] -'0']++;
            }else{
                green[ch[end] - '0']++;
            }

            start+=2;
            end+=2;
        }

        int count=0;
        for(int i =0;i<10;i++){
            if(red[i] >=1 && blue[i] >=1 && green[i]>=1){
                count++;
            }
        }
        return count;
    }
}
