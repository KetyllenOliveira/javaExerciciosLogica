public class Exercicio77 {
    public static void resolver77() {
        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};
        for (int i = 8; i >= 5; i--) {
            int aux = v[i - 1];
            v[i - 1] = v[8 - i];
            v[8 - i] = aux;
        }
        v[3 - 1] = v[1 - 1];
        v[v[3 - 1] - 1] = v[v[2 - 1] - 1];

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
