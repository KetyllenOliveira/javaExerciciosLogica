import java.util.Scanner;

public class Exercicio28 {
    public static void resolver28() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
