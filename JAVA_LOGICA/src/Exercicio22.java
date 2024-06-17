import java.util.Scanner;

public class Exercicio22 {
    public static void resolver22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é ímpar");
        }

        scanner.close();
    }
}
