import java.util.Scanner;

public class Exercicio51 {
    
    public static void resolver51() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de termos da sequência: ");
            int quantidadeTermos = scanner.nextInt();

            int a = 0;
            int b = 1;
            int c;

            System.out.print(a + " ");
            System.out.print(b + " ");

            for (int i = 3; i <= quantidadeTermos; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

    @Override
    public String toString() {
        return "Exercicio51 []";
    }
}
