class Exercicio3 {
    public static void resolver3A() {
        double A1 = (4.0 / 2.0) + (2.0 / 4.0);
        double A2 = 4.0 / 2.0 + 2.0 / 4.0;
        System.out.println("A: " + (A1 == A2)); // True
    }

    public static void resolver3B() {
        double B1 = 4.0 / (2.0 + 2.0) / 4.0;
        double B2 = 4.0 / 2.0 + 2.0 / 4.0;
        System.out.println("B: " + (B1 == B2)); // False
    }

    public static void resolver3C() {
        double C1 = (4.0 + 2.0) * 2.0 - 4.0;
        double C2 = 4.0 + 2.0 * 2.0 - 4.0;
        System.out.println("C: " + (C1 == C2)); // False
    }
}