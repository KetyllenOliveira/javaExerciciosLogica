import java.util.Scanner;

public class Exercicio65 {
    public static void resolver65() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor: ");
            int valor1 = scanner.nextInt();
            System.out.print("Digite o segundo valor: ");
            int valor2 = scanner.nextInt();
            int soma = 0;
            for (int i = valor1; i <= valor2; i++) {
                soma += i;
            }
            System.out.println("Soma dos valores entre " + valor1 + " e " + valor2 + ": " + soma);
        }
    }
}
