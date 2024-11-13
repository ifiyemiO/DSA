package RecursionMethod;

// Write a function that finds the sum of a positive integer number using recursion

public class Recursive {
    public static int recursive(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + recursive(n/10);
    }

    public static void main(String[] args) {
        System.out.println(recursive(10));
        System.out.println(recursive(12));
        System.out.println(recursive(110));
        System.out.println(recursive(112));

    }
}
