package CodeChef;

import java.util.Scanner;

public class MountainPeak {
    public static int[] nextHigherPeak(int[] heights) {
        // Write your code here
        int n = heights.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1; // Default value
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[i]) {
                    result[i] = heights[j];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; ++i) {
            heights[i] = sc.nextInt();
        }

        int[] result = nextHigherPeak(heights);

        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
    }
}
