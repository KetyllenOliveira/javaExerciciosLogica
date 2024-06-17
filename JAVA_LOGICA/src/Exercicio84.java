import java.util.Scanner;

public class Exercicio84 {
    public static void resolver84() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int soma = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
                soma += numeros[i];
            }
            double media = soma / 10.0;
            int acimaMedia = 0;
            for (int numero : numeros) {
                if (numero > media) {
                    acimaMedia++;
                }
            }
            System.out.println("Média dos números: " + media);
            System.out.println("Quantidade de números acima da média: " + acimaMedia);
        }
    }
}
