import java.util.Scanner;

public class Exercicio83 {
    public static void resolver83() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[20];
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            int somaPositivos = 0;
            int somaNegativos = 0;
            for (int numero : numeros) {
                if (numero > 0) {
                    somaPositivos += numero;
                } else if (numero < 0) {
                    somaNegativos += numero;
                }
            }
            System.out.println("Soma dos números positivos: " + somaPositivos);
            System.out.println("Soma dos números negativos: " + somaNegativos);
        }
    }
}
