package LambdaExpression;

//FUNCTIONAL INTERFACE
//an interface with only 1 abstract method

interface MyNumber{
    double getValue();
}

interface fact{
    int calc(int n);
}

interface Reverse{
    String func(String n);
}

interface Factor{
    int factor(int n);
}

public class Introduction {
    public static void main(String[] args) {
        MyNumber mynum;//refrence variable
        mynum = () -> 123.45;
        System.out.println(mynum.getValue());

        fact F;

        F = (n) -> {
            int pro = 1;
            for (int i = 1; i <= n; i++) {
                pro *= i;
            }
            return pro;
        };

        System.out.println(F.calc(5));

        Reverse reverse;
        reverse = (n) -> {
            StringBuilder s = new StringBuilder(n);
            s.reverse();

            return s.toString();
        };

        System.out.println(reverse.func("misty"));

        Factor fact1;
        fact1 = (n) -> {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(fact1.factor(5));

    }
}