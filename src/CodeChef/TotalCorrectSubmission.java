package CodeChef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TotalCorrectSubmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();

        while (t-- >0){
            HashMap<String,Integer> map = new HashMap<>();
            int n=sc.nextInt();
            sc.nextLine();
            for(int i =0 ;i<3*n;i++){
                String s = sc.nextLine();
                String[] arr = s.split(" ");
                map.put(arr[0],map.getOrDefault(arr[0],0)+Integer.parseInt(arr[1]));
            }

            int[] var = new int[map.size()];
            int j=0;
            for(int i:map.values()){
                var[j++]=i;
            }
            Arrays.sort(var);
            for(int i:var){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
