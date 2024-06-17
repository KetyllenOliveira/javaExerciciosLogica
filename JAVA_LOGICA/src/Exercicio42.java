import java.util.Scanner;

public class Exercicio42 {
    public static void resolver42() {
        Scanner scanner = new Scanner(System.in);{

        System.out.print("Digite o número do empregado: ");
        int numeroEmpregado = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idade = 2024 - anoNascimento;
        int tempoTrabalho = 2024 - anoIngresso;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}
}