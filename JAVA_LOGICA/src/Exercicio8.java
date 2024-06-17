import java.util.Scanner;

public class Exercicio8 {
    public static void resolver8() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número total de eleitores: ");
    int totalEleitores = scanner.nextInt();

    System.out.print("Digite o número de votos brancos: ");
    int votosBrancos = scanner.nextInt();

    System.out.print("Digite o número de votos nulos: ");
    int votosNulos = scanner.nextInt();

    System.out.print("Digite o número de votos válidos: ");
    int votosValidos = scanner.nextInt();

    double percentualBrancos = (votosBrancos / (double)totalEleitores) * 100;
    double percentualNulos = (votosNulos / (double)totalEleitores) * 100;
    double percentualValidos = (votosValidos / (double)totalEleitores) * 100;

    System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
    System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

    scanner.close();
}
}