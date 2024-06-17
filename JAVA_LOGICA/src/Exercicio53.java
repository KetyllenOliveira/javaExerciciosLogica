import java.util.Scanner;

public class Exercicio53 {
    
    public static void resolver53() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor de N: ");
            int n = scanner.nextInt();

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += (2 * i - 1.0) / i;
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio53 []";
    }
}
