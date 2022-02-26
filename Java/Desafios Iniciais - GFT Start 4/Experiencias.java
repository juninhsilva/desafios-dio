import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) throws IOException{
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        char tipo = ' ';
        int coelho = 0, rato = 0, sapo = 0, i;
        int a = Integer.valueOf(leitor.readLine());

        for (i = 0; i < a; i++) {
            String buffer = leitor.readLine();
            String[] infos = buffer.split(" ");
            tipo = infos[1].toUpperCase().charAt(0);
            if (tipo == 'C') {
                coelho += Integer.parseInt(infos[0]);
            } else if (tipo == 'S') {
                sapo += Integer.parseInt(infos[0]);
            } else if (tipo == 'R') {
                rato += Integer.parseInt(infos[0]);
            }
        }

        int totalCobaias = coelho+rato+sapo;
        double mediaCoelhos = (coelho * 100) / (double) totalCobaias;
        double mediaRatos = (rato * 100) / (double) totalCobaias;
        double mediaSapos = (sapo * 100) / (double) totalCobaias;
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");
    }
}
