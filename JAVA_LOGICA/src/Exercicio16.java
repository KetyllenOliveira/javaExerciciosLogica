import java.util.Scanner;

public class Exercicio16 {
    public static void resolver16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        double custo;

        if (quantidade < 12) {
            custo = quantidade * 1.30;
        } else {
            custo = quantidade * 1.00;
        }

        System.out.println("Custo total: R$ " + custo);
        scanner.close();
    }
}
