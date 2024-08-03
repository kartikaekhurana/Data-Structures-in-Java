
import java.util.Arrays;

public class MoveZerosLeet {
public static void main(String args[]){
    int arr[] = {2,0,5,3,0,7,8};
    ZerostoEnd(arr);
}    
static void ZerostoEnd(int[] arr){
    int n = arr.length;
    for(int i = n-1; i>=0 ; i--){
        int mini = n-1;
        for(int j = n-2; j>1; j--){
        if(arr[j] == 0){
            mini = j;
     int temp = arr[j];
     arr[j]=arr[mini];
     arr[mini] = temp; 
        }
    }
        
}
    System.out.println(Arrays.toString(arr));

}}