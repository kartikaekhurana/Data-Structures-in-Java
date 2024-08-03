import java.util.*;
public class RecursionSum {
    public static void SumOf(int i, int n , int sum){
         if(i == n){
             sum += i;
             System.out.println("The Sum is : " + sum);
             return;
         }
         sum += i;
         SumOf(i+1,n,sum);       
    }   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start From?");
        int i = sc.nextInt();
        System.out.println("Upto..........?");
        int n = sc.nextInt();
            int sum  = 0;
        SumOf(i,n,sum);
        
                
    }   
}
