import java.util.*;
public class FactorialRecursive {
    public static int Factorial(int n){
        if(n == 1 || n ==0){
            return 1;
        }
         int fm = n * Factorial(n-1);
         return fm;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of .........?");
        int n = sc.nextInt();
        int ans = Factorial(n);
        System.out.println(ans);

    }
}
