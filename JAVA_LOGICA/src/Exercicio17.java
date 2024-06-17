
import java.util.Scanner;

public class Exercicio17 {
    public static void resolver17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.println("Aluno reprovado! Média: " + media);
        }
        scanner.close();
    }

}
