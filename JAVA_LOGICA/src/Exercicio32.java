import java.util.Scanner;

public class Exercicio32 {
    public static void resolver32() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scanner.next();
        System.out.print("Digite o número de gols do primeiro time: ");
        int gols1 = scanner.nextInt();

        System.out.print("Digite o nome do segundo time: ");
        String time2 = scanner.next();
        System.out.print("Digite o número de gols do segundo time: ");
        int gols2 = scanner.nextInt();

        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}
