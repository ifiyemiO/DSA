package DecimalToBinaryRecursion;

//Write a function that takes in any decimal number and converts to a binary number using the flow

public class DecToBin {
    public static String decToBinary(int n) {
        if (n == 0) {
            return "";
        }

        return decToBinary(n / 2) + n % 2;

    }
    public static void main(String[] args) {
        System.out.println(decToBinary(10));

        System.out.println(decToBinary(12));

        System.out.println(decToBinary(50));

    }

}
