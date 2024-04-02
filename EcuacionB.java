public class EcuacionB {
    public static void main(String[] args) {
        int n = 100; // Puedes cambiar este valor para probar con diferentes valores de n
        long resultado = calcularEcuacionB(n);
        System.out.println("Ecuación b: f(n) = 5n + 4n^2 - sqrt(n) + 1");
        System.out.println("Para n = " + n + ", f(n) = " + resultado);
        System.out.println("Complejidad: O(n^2)");
    }

    public static long calcularEcuacionB(int n) {
        return 5 * n + 4 * (long) Math.pow(n, 2) - (long) Math.sqrt(n) + 1;
    }
}
