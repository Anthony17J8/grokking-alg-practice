package recursion;

public class FactorialDemo {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        i = i * factorial(i - 1);
        return i;
    }
}
