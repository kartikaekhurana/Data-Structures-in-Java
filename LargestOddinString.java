import java.util.*;
public class LargestOddinString {
public static void main(String args[]){
     System.out.println("Enter the String!");
        Scanner in = new Scanner(System.in);
       String S = in.nextLine();
       System.out.println("The String you Entered is : "+ S);
       System.out.println("The Largest Odd in String is : ");
       System.out.println(target(S));
               
      
}   
private static int target(String S){
             String S2 = " ";
     for(int i = 0 ; i < S.length() ; i++){
         char c = S.charAt(i);
         if(c % 2 != 0){                                                                           
         S2 += c ;
         }
     }
     char largest = S2.charAt(0);
     for(int j = 0 ; j < S2.length() ; j++){
         if(S2.charAt(j) > largest){
             largest = S2.charAt(j);
         }
     }
 return largest;
} 
}

