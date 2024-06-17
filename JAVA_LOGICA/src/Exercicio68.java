import java.util.Scanner;

public class Exercicio68 {
    
    public static void resolver68() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += (2 * i - 1) / (double)(i * i);
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio68 []";
    }
}
