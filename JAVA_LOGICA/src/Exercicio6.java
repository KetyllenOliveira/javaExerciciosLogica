import java.util.Scanner;
class Exercicio6 {
    public static void resolver6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
        scanner.close();
    }
}