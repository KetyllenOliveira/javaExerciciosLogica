import java.util.Scanner;

public class Exercicio15 {
    public static void resolver15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
            scanner.close();
        }
    }
}
