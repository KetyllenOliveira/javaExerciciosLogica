import java.util.Scanner;

public class Exercicio52 {
    
    public static void resolver52() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor de N: ");
            int n = scanner.nextInt();

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += 1.0 / i;
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio52 []";
    }
}
