import java.util.Scanner;

public class Exercicio20 {
    public static void resolver20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 < valor2) {
            System.out.println("Ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Ordem crescente: " + valor2 + ", " + valor1);
        }
        scanner.close();

    }
}
