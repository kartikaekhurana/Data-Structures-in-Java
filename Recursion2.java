import java.util.*;
public class Recursion2 {
    public static void printN(int a, int N){
        if(a > N){
            return; 
        }
        System.out.println(a);
        printN(a+1,N);
    }
    public static void main(String args[]){
        int a = 1;
        Scanner i = new Scanner(System.in);
        System.out.println("Upto N print ! Write N");
        int N = i.nextInt();
        printN(a,N);
        
    }
            
}
