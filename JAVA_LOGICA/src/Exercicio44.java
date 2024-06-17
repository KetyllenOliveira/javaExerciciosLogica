import java.util.Scanner;

public class Exercicio44 {
    public static void resolver44() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        int valor2;

        do {
            System.out.print("Digite o segundo valor (diferente de zero): ");
            valor2 = scanner.nextInt();
        } while (valor2 == 0);

        double resultado = (double) valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}