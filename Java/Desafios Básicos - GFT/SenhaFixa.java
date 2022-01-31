import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String senha = leitor.next();
        // implemente o seu código aqui
        while (!senha.equals("2002")) {
            System.out.println("Senha Invalida");
            senha = leitor.next();
        }
        System.out.println("Acesso Permitido");
    }
}
