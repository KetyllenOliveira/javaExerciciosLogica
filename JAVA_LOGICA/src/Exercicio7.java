import java.util.Scanner;

class Exercicio7 {
    public static void resolver7() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite a idade em anos: ");
            int anos = scanner.nextInt();
            System.out.print("Digite a idade em meses: ");
            int meses = scanner.nextInt();
            System.out.print("Digite a idade em dias: ");
            int dias = scanner.nextInt();

            int idadeEmDias = anos * 365 + meses * 30 + dias;
            System.out.println("Idade em dias: " + idadeEmDias);
        } finally {
            scanner.close();
        }
    }
}
