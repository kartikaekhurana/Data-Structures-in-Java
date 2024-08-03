import java.util.*;
public class FibonacciRecursive {
    public static void Fibonacci(int n,int a, int b){
        if(n == 0 ){
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fibonacci(n-1,b,c);
}
    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      System.out.println("FiboNacci Series Upto..........?");
      int n = scn.nextInt();
        int a = 0;
        int b = 1;
      System.out.println(a);   
      System.out.println(b);
      Fibonacci(n-2,a,b);

    }
}
