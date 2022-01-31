import java.util.Scanner;

public class TopN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int[] TOPS = { 1, 3, 5, 10, 25, 50, 100 };
        int posicao = scan.nextInt();
        // escreva aqui o seu código
        if (posicao == 1)
            System.out.println("Top 1");
        else if (posicao > 1 && posicao <= 3)
            System.out.println("Top 3");
        else if (posicao > 3 && posicao <= 5)
            System.out.println("Top 5");
        else if (posicao > 5 && posicao <= 10)
            System.out.println("Top 10");
        else if (posicao > 10 && posicao <= 25)
            System.out.println("Top 25");
        else if (posicao > 25 && posicao <= 50)
            System.out.println("Top 50");
        else
            System.out.println("Top 100");
    }
}
