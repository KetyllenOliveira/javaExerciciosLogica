import java.util.Scanner;

public class Exercicio11 {
    public static void resolver11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos pelo vendedor: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas efetuadas pelo vendedor: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        double comissaoPorCarro = valorPorCarro * numCarrosVendidos;
        double comissaoPorVendas = 0.05 * valorTotalVendas;

        
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        
        System.out.println("Salário final do vendedor: " + salarioFinal);

        scanner.close();
    }
}

