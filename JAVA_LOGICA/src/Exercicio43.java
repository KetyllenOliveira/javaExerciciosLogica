import java.util.Scanner;

public class Exercicio43 {
    public static void resolver43() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        String mens;

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                mens = "Triângulo Equilátero";
            } else if (a == b || b == c || a == c) {
                mens = "Triângulo Isósceles";
            } else {
                mens = "Triângulo Escaleno";
            }
        } else {
            mens = "Não é possível formar um triângulo";
        }

        System.out.println("Resultado: " + mens);

        scanner.close();
    }
}
