import java.util.*;
public class ArrayFrequency {
    public static void main(String[] args){
        System.out.println("The Array Elements Are : ");
        int[] arr = {1, 3, 5, 5, 3, 4, 7, 9};
            System.out.print(arr);
        
        System.out.println("\nEnter the Number Upto Which you want to Check On:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayFrequencyChart(arr, n);
    }

    public static void ArrayFrequencyChart(int[] arr, int n){
        for(int i = 1; i <= n; i++){
            int c = 0;
            for(int j = 0; j < arr.length; j++){
                if(i == arr[j]){
                    c += 1;
                }
            }
            System.out.println("The Frequency of " + i + " is: " + c);
        }
    }
}
