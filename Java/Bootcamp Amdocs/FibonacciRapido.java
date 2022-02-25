import java.util.Scanner;

public class FibonacciRapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double fib = (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5);
        System.out.printf("%.1f", fib);
    }
}
