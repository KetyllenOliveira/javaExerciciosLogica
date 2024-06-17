import java.util.Scanner;

public class Exercicio88 {
    public static void resolver88() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[15];
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite um número: ");
                numeros[i] = scanner.nextInt();
            }
            int somaPares = 0;
            int somaImpares = 0;
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    somaPares += numero;
                } else {
                    somaImpares += numero;
                }
            }
            System.out.println("Soma dos números pares: " + somaPares);
            System.out.println("Soma dos números ímpares: " + somaImpares);
        }
    }
}
