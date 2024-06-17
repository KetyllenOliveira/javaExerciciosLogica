class Exercicio2 {
    public static void resolverA() {
        int A = 10;
        int B = 20;
        System.out.println(B); // Escrever B
        B = 5;
        System.out.println(A + ", " + B); // Escrever A, B
    }

    public static void resolverB() {
        int A = 30;
        int B = 20;
        int C = A + B;
        System.out.println(C); // Escrever C
        B = 10;
        System.out.println(B + ", " + C); // Escrever B, C
        C = A + B;
        System.out.println(A + ", " + B + ", " + C); // Escrever A, B, C
    }

    public static void resolverC() {
        int A = 10;
        int B = 20;
        int C = A;
        B = C;
        A = B;
        System.out.println(A + ", " + B + ", " + C); // Escrever A, B, C
    }

    public static void resolverD() {
        int A = 10;
        int B = A + 1;
        A = B + 1;
        B = A + 1;
        System.out.println(A); // Escrever A
        A = B + 1;
        System.out.println(A + ", " + B); // Escrever A, B
    }

    public static void resolverE() {
        int A = 10;
        int B = 5;
        int C = A + B;
        B = 20;
        A = 10;
        System.out.println(A + ", " + B + ", " + C); // Escrever A, B, C
    }

    public static void resolverF() {
        int X = 1;
        int Y = 2;
        int Z = Y - X;
        System.out.println(Z); // Escrever Z
        X = 5;
        Y = X + Z;
        System.out.println(X + ", " + Y + ", " + Z); // Escrever X, Y, Z
    }
}
