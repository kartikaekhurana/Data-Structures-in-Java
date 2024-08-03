import java.util.*;
public class AscendingOrderArray {
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        Integer arr[]=new Integer[8];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<7;i++)
        {
            arr[i]=input.nextInt();
        }
        int n = 0;       
         for (int i = 0; i <= 7; i++)
         {     
            for (int j = i+1; j <= 7; j++) 
            {     
               if(arr[i] > arr[j])
               {    
                   n = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = n; 
               }     
            }     
        }              
        System.out.println();       
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i <= 7; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
    }
}  

