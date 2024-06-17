import java.util.Scanner;

public class Exercicio78 {
    public static void resolver78() {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] nomes = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                nomes[i] = scanner.next();
            }
            System.out.print("Digite mais um nome: ");
            String nomeBusca = scanner.next();
            boolean encontrado = false;
            for (String nome : nomes) {
                if (nome.equals(nomeBusca)) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("ACHEI");
            } else {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}
