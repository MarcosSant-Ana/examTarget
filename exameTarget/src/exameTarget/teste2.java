package exameTarget;

import java.util.Scanner;

public class teste2 {

    public static void main(String[] args) {
        // Definido o número que será verificado
        int n = 20;

        if (isFibonacci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false; // Números negativos não pertencem à sequência de Fibonacci
        }

        int fib1 = 0;
        int fib2 = 1;

        if (n == fib1 || n == fib2) { // Verifica se n é 0 ou 1
            return true; 
        }

        while (fib2 <= n) {
            if (fib2 == n) {
                return true;
            }
            int aux = fib1;
            fib1 = fib2;
            fib2 = aux + fib2;
        }
        return false;
    }
}