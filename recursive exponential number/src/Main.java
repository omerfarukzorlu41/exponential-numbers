import java.util.Scanner;

public class Main {
    static int exponential(int k, int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result *= k;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        System.out.print("Enter the base value :");
        base = scanner.nextInt();
        System.out.print("enter the exponent value :");
        exponent = scanner.nextInt();
        System.out.println(base+" ^ "+exponent+" = "+exponential(base, exponent));
    }
}
