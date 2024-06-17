import java.util.Scanner;
class Exercicio5 {
    public static void resolver5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        System.out.println("Antecessor: " + (valor - 1));
        scanner.close();

    }
}