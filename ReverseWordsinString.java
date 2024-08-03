import java.util.*;
public class ReverseWordsinString {
    public static void main(String args[]){
        System.out.println("Enter the Pharase you want to Reverse");
        Scanner sc = new Scanner(System.in);
        String Original = sc.nextLine();
        String WordsReversed = returnReversed(Original);
        System.out.println("The Reversed Words Are ");
                System.out.println(WordsReversed);

        
    }
    public static String returnReversed(String Original){
        String[] words = Original.split(" ");
        String Reversed = "";
        for(int i = words.length - 1 ; i  >= 0 ; i--){
            Reversed += words[i];
                    if(i != 0 ){
        Reversed += " ";
        }

    }
     return Reversed;
    }
}
