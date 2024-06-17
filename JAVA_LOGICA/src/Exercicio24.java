import java.util.Scanner;

public class Exercicio24 {
    public static void resolver24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int maior = valor1 > valor2 ? valor1 : valor2;
        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
