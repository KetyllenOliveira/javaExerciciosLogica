import java.util.Scanner;

public class Exercicio29 {
    public static void resolver29() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            soma += i;
        }

        System.out.println("A soma dos números entre " + num1 + " e " + num2 + " é: " + soma);

        scanner.close();
    }
}
