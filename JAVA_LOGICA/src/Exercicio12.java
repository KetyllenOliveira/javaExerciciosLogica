import java.util.Scanner;

public class Exercicio12 {
    public static void resolver12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convertendo Fahrenheit para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Exibindo a temperatura em Celsius
        System.out.println("Temperatura em graus Celsius: " + celsius);

        scanner.close();
    }
}
