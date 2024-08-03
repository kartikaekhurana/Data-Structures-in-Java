import java.util.*;
public class RotationJavaString {
public static void main(String args[]){
    System.out.println("Enter the First String : ");
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    System.out.println("Enter the Second String : ");
    String b = in.nextLine();
    CheckStrings(a,b);
}
public static void CheckStrings(String a, String b){
    String  S2 = "";
    for(int i = a.length() - 1 ; i >= 0 ; i--){
        S2 += a.charAt(i);        
    }
    if (S2.equals(b)){
        System.out.println("The Strings Are Rotation of Each other");
    }
    else{
        System.out.println("Both have No Connection");
    }
}


    
}
