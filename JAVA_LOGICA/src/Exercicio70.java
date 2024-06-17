import java.util.Scanner;

public class Exercicio70 {
    
    public static void resolver70() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += i / (double)((2 * i + 1) * (2 * i + 2));
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio70 []";
    }
}
