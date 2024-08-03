import java.util.*;
public class StringTokenizerExample {
    public static void main(String args[]){
        String s = "My Name is Kartikae Khurana";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
                    System.out.println(st.nextToken());

        }
    }
}
