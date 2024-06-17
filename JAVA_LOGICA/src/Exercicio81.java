import java.util.Scanner;

public class Exercicio81 {
    public static void resolver81() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leitura dos números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }

            // Cálculo da soma dos números pares e contagem dos ímpares
            int somaPares = 0;
            int quantidadeImpares = 0;

            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    somaPares += numero;
                } else {
                    quantidadeImpares++;
                }
            }

            // Exibição dos resultados
            System.out.println("Soma dos números pares: " + somaPares);
            System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        }
    }
}
