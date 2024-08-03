import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        int key;
        int[] arr = new int[5];
        Scanner inp = new Scanner(System.in);
        System.out.println("Write your array members: ");
        for(int i=0;i<arr.length;i++){
         arr[i] = inp.nextInt();
        }
        System.out.println("Write your array member whose index has to be checked: ");
         key = inp.nextInt();
         System.out.println(Linear(arr , key));

    }
    public static int Linear(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
         if (arr[i] == key){
             return i;
         }
         else{
             System.out.println("Not Found");
         }
        }
        
        return -1;
    }
}