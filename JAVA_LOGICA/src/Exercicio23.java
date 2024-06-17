import java.util.Scanner;

public class Exercicio23 {
    public static void resolver23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 100 && valor <= 200) {
            System.out.println("O valor está entre 100 e 200");
        } else {
            System.out.println("O valor não está entre 100 e 200");
        }

        scanner.close();
    }
}
