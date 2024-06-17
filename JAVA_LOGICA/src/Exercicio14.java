import java.util.Scanner;

public class Exercicio14 {
    public static void resolver14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
            scanner.close();
        }
    }
}
