import java.util.Scanner;

public class Exercicio13 {
    public static void resolver13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calculando a média ponderada
        double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        // Exibindo a média final
        System.out.println("Média final: " + mediaFinal);

        scanner.close();
    }
}
