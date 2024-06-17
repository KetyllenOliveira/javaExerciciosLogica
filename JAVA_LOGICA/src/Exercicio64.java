import java.util.Scanner;

public class Exercicio64 {
    
    public static void resolver64() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;
            int numerador = 2;
            int denominador = 1;

            for (int i = 1; i <= n; i++) {
                soma += numerador / (double)denominador;
                numerador += 2;
                denominador++;
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio64 []";
    }
}
