import java.util.Scanner;

public class KageBunshinJutsu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Escreva o seu código aqui
        while (sc.hasNext()) {
            int total = sc.nextInt();
            if (total >= 1 && total <= 106) {
                if (total == 1) {
                    System.out.println(0);
                } else if (total % 2 == 0) {
                    System.out.println(total / 2);
                }
            }
        }
        sc.close();
    }
}