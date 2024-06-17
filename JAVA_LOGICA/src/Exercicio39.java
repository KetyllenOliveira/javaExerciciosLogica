public class Exercicio39 {
    public static void resolver39() {
        boolean A = true;
        boolean B = true;
        boolean C = false;

        boolean resultadoA = (A && B) || (A ^ B);
        boolean resultadoB = (A || B) && (A && C);
        boolean resultadoC = A || C && B ^ A && !B;

        System.out.println("Resultado da expressão a: " + resultadoA);
        System.out.println("Resultado da expressão b: " + resultadoB);
        System.out.println("Resultado da expressão c: " + resultadoC);
    }
}
