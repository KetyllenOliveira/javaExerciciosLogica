import java.util.Scanner;

public class Exercicio9 {
    public static void resolver9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        
        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

      
        System.out.println("Novo salário: " + novoSalario);

        scanner.close();
    }
    
}
