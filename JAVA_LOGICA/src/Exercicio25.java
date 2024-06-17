import java.util.Scanner;

public class Exercicio25 {
    public static void resolver25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        if (prestacao <= salario * 0.3) {
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Empréstimo não concedido");
        }

        scanner.close();
    }
}
