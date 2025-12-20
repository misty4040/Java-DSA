package leetcode;

public class Q1423 {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints,k));
        
    }

    private static int maxScore(int[] cardPoints, int k) {
        int total = 0;
        int n= cardPoints.length;
        for(int points:cardPoints){
            total+=points;
        }

        if(k==n){
            return total;
        }

        int windowsize = n-k;
        int windowsum = 0;

        for(int i=0;i<windowsize;i++){
            windowsum+=cardPoints[i];
        }

        int mins = windowsum;

        for(int i=windowsize;i<n;i++){
            windowsum += cardPoints[i] - cardPoints[i-windowsize];
            mins = Math.min(windowsum,mins);
        }

        return total - mins;
    }
}
