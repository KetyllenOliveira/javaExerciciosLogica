import java.util.Scanner;

public class Exercicio35 {
    public static void resolver35() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = scanner.next().charAt(0);

        double precoPorLitro = tipo == 'A' ? 2.90 : 3.30;
        double desconto = 0;

        if (tipo == 'A') {
            desconto = litros <= 20 ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            desconto = litros <= 20 ? 0.04 : 0.06;
        }

        double total = litros * precoPorLitro;
        double valorDesconto = total * desconto;
        double valorAPagar = total - valorDesconto;

        System.out.println("Valor a ser pago: R$ " + valorAPagar);

        scanner.close();
    }
}
