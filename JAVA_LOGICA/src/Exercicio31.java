import java.util.Scanner;

public class Exercicio31 {
    public static void resolver31() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o lado B: ");
        int b = scanner.nextInt();
        System.out.print("Digite o lado C: ");
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}
