import java.util.Scanner;

public class EncaixaOuNao {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (String.valueOf(a).endsWith(String.valueOf(b)))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}
