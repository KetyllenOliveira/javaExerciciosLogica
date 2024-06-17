import java.util.Scanner;

public class Exercicio72 {
    public static void resolver72 () {
        try (Scanner scanner = new Scanner(System.in)) {
            double maiorPreco = Double.MIN_VALUE;
            double somaPrecos = 0.0; // Inicializamos com 0.0 para utilizar double
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                if (preco > maiorPreco) {
                    maiorPreco = preco;
                }
                somaPrecos += preco;
            }
            double mediaPrecos = somaPrecos / 15.0; // Dividimos por 15.0 para garantir a divisão de double
            System.out.println("Maior preço: " + maiorPreco);
            System.out.println("Média dos preços: " + mediaPrecos);
        }
    }
}
