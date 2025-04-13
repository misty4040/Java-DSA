package leetcode;

import java.util.HashSet;

public class Q575 {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int res=distributeCandies(candyType);
        System.out.println(res);
    }

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandies = new HashSet<>();

        // Add each candy type to the set to ensure uniqueness
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Calculate the maximum number of candies Alice can eat
        int maxCandiesAliceCanEat = candyType.length / 2;

        // The result is the minimum of unique candy types and the number Alice can eat
        return Math.min(uniqueCandies.size(), maxCandiesAliceCanEat);
    }
}
