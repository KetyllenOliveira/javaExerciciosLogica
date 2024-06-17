import java.util.Scanner;

public class Exercicio37 {
    public static void resolver37() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (Kg): ");
        double morangos = scanner.nextDouble();
        System.out.print("Digite a quantidade de maçãs (Kg): ");
        double macas = scanner.nextDouble();

        double precoMorango = morangos <= 5 ? 2.50 : 2.20;
        double precoMaca = macas <= 5 ? 1.80 : 1.50;

        double totalMorango = morangos * precoMorango;
        double totalMaca = macas * precoMaca;
        double totalCompra = totalMorango + totalMaca;

        if (morangos + macas > 8 || totalCompra > 25.00) {
            totalCompra *= 0.9;
        }

        System.out.println("Valor a ser pago: R$ " + totalCompra);

        scanner.close();
    }
}
