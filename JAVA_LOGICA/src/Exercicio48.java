import java.util.Scanner;

public class Exercicio48 {
    public static void resolver48() {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2;
        do {
            System.out.print("Digite a primeira nota (0 a 10): ");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota (0 a 10): ");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        scanner.close();
    }
}
