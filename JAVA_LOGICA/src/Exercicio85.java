import java.util.Scanner;

public class Exercicio85 {
    public static void resolver85() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[15];
            int soma = 0;
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
                soma += numeros[i];
            }
            double media = soma / 15.0;
            int abaixoMedia = 0;
            for (int numero : numeros) {
                if (numero < media) {
                    abaixoMedia++;
                }
            }
            System.out.println("Média dos números: " + media);
            System.out.println("Quantidade de números abaixo da média: " + abaixoMedia);
        }
    }
}
