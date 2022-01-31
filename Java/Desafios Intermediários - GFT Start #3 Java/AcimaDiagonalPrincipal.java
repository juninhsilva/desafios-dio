import java.util.Scanner;

public class AcimaDiagonalPrincipal {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // digite o seu código
        char opcao = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        double soma = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j < i && j > M.length - i - 1)
                    soma += M[i][j];
            }
        }
        if (opcao == 'M')
            soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
