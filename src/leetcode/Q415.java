package leetcode;

public class Q415 {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String res=addStrings(num1,num2);
        System.out.println(res);
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = n1 + n2 + carry;
            result.append(sum % 10); // Add last digit of sum
            carry = sum / 10; // Update carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
