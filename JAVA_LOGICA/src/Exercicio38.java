import java.util.Scanner;

public class Exercicio38 {
    public static void resolver38() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de usuário: ");
        int codigoUsuario = scanner.nextInt();

        if (codigoUsuario != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        scanner.close();
    }
}
