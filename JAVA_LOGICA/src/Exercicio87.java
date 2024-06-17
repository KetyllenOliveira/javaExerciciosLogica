import java.util.Scanner;

public class Exercicio87 {
    public static void resolver87() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[15];
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            int quantidadePositivos = 0;
            int quantidadeNegativos = 0;
            for (int numero : numeros) {
                if (numero > 0) {
                    quantidadePositivos++;
                } else if (numero < 0) {
                    quantidadeNegativos++;
                }
            }
            System.out.println("Quantidade de números positivos: " + quantidadePositivos);
            System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
        }
    }
}
