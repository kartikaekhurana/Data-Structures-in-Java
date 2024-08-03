import java.util.*;
public class ReverseString1 {
    public static void main(String[] args){
        System.out.println("Enter the String You Want to Reverse!");
        Scanner sc = new Scanner(System.in);
        String Original = sc.nextLine();
        String Reversed = reversestring(Original);
        System.out.println("The Reversed String is " + Reversed);
        
    }
    public static String reversestring(String Original){
        String Reversed = "";
        for(int i = Original.length() - 1 ; i >=0 ; i--){
            Reversed += Original.charAt(i);
        }
        return Reversed;
    }

    
}
