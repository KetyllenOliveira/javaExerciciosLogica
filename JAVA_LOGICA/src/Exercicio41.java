import java.util.Scanner;

public class Exercicio41 {
    public static void resolver41() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;
        char conceito;

        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}
