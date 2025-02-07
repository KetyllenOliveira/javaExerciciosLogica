import java.util.Scanner;

class Exercicio40 {
    
    public static void resolver40() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a descrição do produto: ");
            String produto  = scanner.next();
            System.out.print("Digite a quantidade adquirida: ");
            int quantidade = scanner.nextInt();
            System.out.print("Digite o preço unitário: ");
            double precoUnitario = scanner.nextDouble();

            double total = quantidade * precoUnitario;
            double desconto = 0;

            if (quantidade <= 5) {
                desconto = total * 0.02;
            } else if (quantidade <= 10) {
                desconto = total * 0.03;
            } else {
                desconto = total * 0.05;
            }

            double totalAPagar = total - desconto;

            System.out.println("Total: R$ " + total);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Total a pagar: R$ " + totalAPagar);
        }
    }

    @Override
    public String toString() {
        return "Exercicio40 []";
        
    }
}

