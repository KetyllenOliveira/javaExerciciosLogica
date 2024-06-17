import java.util.Scanner;

public class Exercicio36 {
    public static void resolver36() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = scanner.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomem2 = scanner.nextInt();
        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);

        scanner.close();
    }
}
