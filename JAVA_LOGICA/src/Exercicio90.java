import java.util.Scanner;

public class Exercicio90 {
    public static void resolver90() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[15];
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println("Número na posição " + i + ": " + numeros[i]);
            }
        }
    }
}
