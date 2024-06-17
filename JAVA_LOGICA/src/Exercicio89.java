import java.util.Scanner;

public class Exercicio89 {
    public static void resolver89() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Número na posição " + i + ": " + numeros[i]);
            }
        }
    }
}
