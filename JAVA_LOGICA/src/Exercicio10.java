import java.util.Scanner;

public class Exercicio10 {
     public static void resolver10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoDistribuidor = 0.28 * custoFabrica;
        double impostos = 0.45 * custoFabrica;

        double custoFinal = custoFabrica + custoDistribuidor + impostos;

        System.out.println("Custo final ao consumidor: " + custoFinal);

        scanner.close();
    }
}
