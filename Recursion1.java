public class Recursion1 {
    public static void printnum(int a){
        if(a == 0){
            return;
        }
        System.out.println(a);
        printnum(a-1);
    }
    public static void main(String args[]){
    int a =5;
    printnum(a);
    }
    }
