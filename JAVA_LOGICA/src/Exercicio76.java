public class Exercicio76 {
    public static void resolver76() { 
        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 60; x++) {
                if (y == 1 || y == 10 || x == 1 || x == 60) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
