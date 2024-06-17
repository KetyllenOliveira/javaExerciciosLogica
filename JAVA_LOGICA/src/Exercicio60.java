import java.util.Scanner;

public class Exercicio60 {
    
    public static void resolver60() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;
            int numerador = 1;
            int denominador = 1;

            for (int i = 1; i <= n; i++) {
                soma += numerador / (double)(2 * i - 1);
                numerador *= -1;
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio60 []";
    }
}
