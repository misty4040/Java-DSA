package leetcode;

public class Q383 {
    public static void main(String[] args) {
        String ransomNote = "aa";//3
        String magazine = "aab";//2
        System.out.println(canConstruct(ransomNote,magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {

        int[] mag = new int[26];
        for(char ch: magazine.toCharArray()){
            mag[ch - 'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){

           if(mag[ransomNote.charAt(i) - 'a'] == 0){
               return false;
           }else{
               mag[ransomNote.charAt(i) - 'a']--;
           }
        }
        return true;
    }
}
