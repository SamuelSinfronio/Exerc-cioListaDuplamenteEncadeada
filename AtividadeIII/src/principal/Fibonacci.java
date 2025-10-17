package principal;

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Série de Fibonacci até ultrapassar 100:");
        int i = 0, valor;
        do {
            valor = fib(i);
            System.out.print(valor + " ");
            i++;
        } while (valor <= 100);
    }
}

