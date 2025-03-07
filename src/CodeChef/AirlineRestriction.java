package CodeChef;
import java.util.*;
import java.lang.*;

public class AirlineRestriction {




        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();  // Number of test cases

            while (T-- > 0) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int D = sc.nextInt();
                int E = sc.nextInt();

                // Check all possible ways to check-in two bags and carry the third
                boolean possible = (A + B <= D && C <= E) ||
                        (A + C <= D && B <= E) ||
                        (B + C <= D && A <= E);

                System.out.println(possible ? "YES" : "NO");
            }
            sc.close();
        }
    }


