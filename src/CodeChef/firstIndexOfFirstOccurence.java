package CodeChef;

public class firstIndexOfFirstOccurence {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int res=strStr(haystack,needle);
        System.out.println(res);
    }

    public static int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }
}
