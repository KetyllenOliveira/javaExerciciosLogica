import java.util.Scanner;

public class Exercicio34 {
    public static void resolver34() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int z = (x * y) + 5;
        String resposta;

        if (z <= 0) {
            resposta = "A";
        } else if (z <= 100) {
            resposta = "B";
        } else {
            resposta = "C";
        }

        System.out.println("Z: " + z + ", Resposta: " + resposta);

        scanner.close();
    }
}
