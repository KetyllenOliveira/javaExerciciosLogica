import java.util.Scanner;

public class Exercicio69 {
    public static void resolver69() {
        try (Scanner scanner = new Scanner(System.in)) {
            double somaValores = 0;
            int quantidade = 0;
            String resposta;
            do {
                System.out.print("Digite o valor da mercadoria: ");
                double valor = scanner.nextDouble();
                somaValores += valor;
                quantidade++;
                System.out.print("Mais mercadorias (S/N)? ");
                resposta = scanner.next();
            } while (resposta.equalsIgnoreCase("S"));
            double mediaValores = somaValores / quantidade;
            System.out.println("Valor total em estoque: " + somaValores);
            System.out.println("Média de valor das mercadorias: " + mediaValores);
        }
    }
}
