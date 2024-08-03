package com.JavaPractical;
public class RecursionFibbonacci {
    public static void main(String[] args) {
        int n = 10; // Calculate Fibonacci sequence up to the 10th number
        System.out.println("Fibonacci sequence up to " + n + "th number:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}
