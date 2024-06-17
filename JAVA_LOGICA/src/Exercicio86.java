import java.util.Scanner;

public class Exercicio86 {
    public static void resolver76() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[20];
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            int maiorPar = Integer.MIN_VALUE;
            for (int numero : numeros) {
                if (numero % 2 == 0 && numero > maiorPar) {
                    maiorPar = numero;
                }
            }
            if (maiorPar != Integer.MIN_VALUE) {
                System.out.println("Maior número par: " + maiorPar);
            } else {
                System.out.println("Não foi digitado nenhum número par.");
            }
        }
    }
}
