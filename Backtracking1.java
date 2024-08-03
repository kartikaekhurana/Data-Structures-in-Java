public class Backtracking1 {
    public static void printPermutation(String str, String perm, int index){
        if(str.length() == 0){
        System.out.println(perm);
        return;
    }
        for(int i = 0 ; i < str.length() ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm +currChar , index + 1 );
                    
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        printPermutation(str, "",0);
    }
}
// 0(n*n) is time complexicity (the most important concept for accenture)