import java.util.Scanner;

public class Exercicio27 {
    public static void resolver27() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
