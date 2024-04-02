public class EcuacionC {
    public static void main(String[] args) {
        int n = 100; // Puedes cambiar este valor para probar con diferentes valores de n
        long resultado = calcularEcuacionC(n);
        System.out.println("Ecuación c: f(n) = 2 log n + 24n + sqrt(2n)");
        System.out.println("Para n = " + n + ", f(n) = " + resultado);
        System.out.println("Complejidad: O(n)");
    }

    public static long calcularEcuacionC(int n) {
        return 2 * (long) (Math.log(n) / Math.log(2)) + 24 * n + (long) Math.sqrt(2 * n);
    }
}
