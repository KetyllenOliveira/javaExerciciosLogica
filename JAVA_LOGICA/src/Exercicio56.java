import java.util.Scanner;

public class Exercicio56 {
    
    public static void resolver56() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            double soma = 0;
            int numerador = 1;
            int denominador = 1;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    soma -= numerador / (double)denominador;
                } else {
                    soma += numerador / (double)denominador;
                }
                numerador++;
                denominador += 2;
            }

            System.out.println("Soma: " + soma);
        }
    }

    @Override
    public String toString() {
        return "Exercicio56 []";
    }
}
