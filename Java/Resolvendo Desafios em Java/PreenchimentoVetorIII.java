// Preenchimento de Vetor III

/*
Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
Em cada posição subsequente de N (1 até 99), coloque a metade do valor
armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

- Entrada

A entrada contem um valor de dupla precisão com 4 casas decimais.

- Saída

Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor
e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser
apresentado com 4 casas decimais.
*/

import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Vetor {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    BigDecimal X = new BigDecimal(leitor.nextDouble());
    BigDecimal[] N = new BigDecimal[100];
    N[0] = X;
    for (int i = 1; i < 100; ++i) {
      N[i] = N[i - 1].divide(new BigDecimal(2));
    }
    DecimalFormat decFormat = new DecimalFormat("0.0000");

    for (int i = 0; i < 100; ++i) {
      System.out.println("N[" + i + "] = " + decFormat.format(N[i]));
    }
  }

}