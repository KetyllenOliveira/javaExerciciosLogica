import java.util.Scanner;

public class Exercicio73 {
    public static void resolver73() {
        try (Scanner scanner = new Scanner(System.in)) {
            double somaSalarios = 0;
            int somaFilhos = 0;
            int quantidadeHabitantes = 0;
            double maiorSalario = Double.MIN_VALUE;
            int pessoasMenor150 = 0;
            while (true) {
                System.out.print("Digite o salário do habitante (negativo para encerrar): ");
                double salario = scanner.nextDouble();
                if (salario < 0) {
                    break;
                }
                System.out.print("Digite o número de filhos do habitante: ");
                int filhos = scanner.nextInt();
                somaSalarios += salario;
                somaFilhos += filhos;
                quantidadeHabitantes++;
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario < 150) {
                    pessoasMenor150++;
                }
            }
            double mediaSalarios = somaSalarios / quantidadeHabitantes;
            double mediaFilhos = somaFilhos / (double) quantidadeHabitantes;
            double percentualMenor150 = (pessoasMenor150 / (double) quantidadeHabitantes) * 100;
            System.out.println("Média de salário: " + mediaSalarios);
            System.out.println("Média do número de filhos: " + mediaFilhos);
            System.out.println("Maior salário: " + maiorSalario);
            System.out.println("Percentual de pessoas com salário menor que R$150: " + percentualMenor150 + "%");
        }
    }
}
