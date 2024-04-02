public class EcuacionA {
    public static void main(String[] args) {
        int n = 100; // Puedes cambiar este valor para probar con diferentes valores de n
        long resultado = calcularEcuacionA(n);
        System.out.println("Ecuación a: f(n) = 2n^3 - 3n^2 + 1");
        System.out.println("Para n = " + n + ", f(n) = " + resultado);
        System.out.println("Complejidad: O(n^3)");
    }

    public static long calcularEcuacionA(int n) {
        return 2 * (long) Math.pow(n, 3) - 3 * (long) Math.pow(n, 2) + 1;
    }
}
