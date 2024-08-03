import java.util.*;

public class StringRemoveParenthesis {
    public static void main(String args[]) {
        StringRemoveParenthesis solution = new StringRemoveParenthesis();        
        String s = "(()())(())";
        System.out.println(solution.RemoveParentheses(s));
    }

    public String RemoveParentheses(String s) {
        StringBuilder result = new StringBuilder();   
        int opencount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opencount > 0) {      
                    result.append(c);  
                }
                opencount++;
            } else if (c == ')') {
                opencount--;
                if (opencount > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
