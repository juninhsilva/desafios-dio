import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OFilme {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        // Escreva aqui a sua lógica
        double porcentagem = ((B - A) / A);
        DecimalFormat format = new DecimalFormat(" 0.00% ");
        System.out.println(format.format(porcentagem));
    }
}
