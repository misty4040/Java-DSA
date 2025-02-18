package leetcode;

public class Q744 {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='b';
        System.out.println(ceilingLetters(arr,target));

    }
    static char ceilingLetters(char[] letters,char target){
        int n=letters.length;
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;

            }
            else {
                start=mid+1;
            }
        }
        return letters[start%n];
    }
}
