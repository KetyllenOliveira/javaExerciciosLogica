import java.util.Scanner;

public class Exercicio67 {
    
    public static void resolver67() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += i / (double)(i * i);
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio67 []";
    }
}
