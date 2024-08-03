import java.util.*;
public class RatFoodProblem {
    public static int Houses(int r, int unit,  int[] arr){
        int total = r * unit ;
        if(total == 0){
            System.out.println("No Food Required");
        }
        else{
            int find = 0;
        for(int i = 0 ; i < arr.length ; i++){
            find += arr[i];
            if(find > total){
               System.out.println("The Rats will need " + (i+1) + " Houses");
               break;

            }
    }        }
             return 0;   
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     System.out.println("Number of Rats?");
     int r = sc.nextInt();
     System.out.println("Food Consumed By Each Unit?");
     int unit  = sc.nextInt();
     int[] arr = {2,8,3,5,7,4,1,2};
        Houses(r,unit,arr);
    }     
     }   
