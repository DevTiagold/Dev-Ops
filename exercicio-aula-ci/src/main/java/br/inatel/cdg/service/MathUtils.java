package br.inatel.cdg.service;

public class MathUtils {
    private MathUtils() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /** Divisão inteira (trunca). Lança IllegalArgumentException se divisor == 0. */
    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisor não pode ser zero");
        return a / b;
    }

    /** Fatorial iterativo. Aceita 0..12 (evita overflow de int). */
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Fatorial de negativo");
        if (n > 12) throw new IllegalArgumentException("n grande demais para int");
        int res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    /** Primalidade simples. 0 e 1 não são primos. */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
