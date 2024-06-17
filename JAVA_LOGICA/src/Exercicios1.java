class Exercicio1 {
    public static void resolver() {
        int A = 10;
        int B = 20;
        System.out.println("Antes da troca: A = " + A + ", B = " + B);

        // Troca de valores
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca: A = " + A + ", B = " + B);
    }
}
