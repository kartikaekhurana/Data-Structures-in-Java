
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int arr[] = {6,3,7,3,1};
        SelectAndSort(arr);        
    }
static void SelectAndSort(int[] arr){
for(int i = 0 ; i <= arr.length - 2; i++){
       int mini = i;
    for(int j = i+1 ; j <= arr.length -1;j++){
        if (arr[j] < arr[mini]){
            mini = j;
            int temp = arr[mini];
     arr[mini]=arr[i];
     arr[i] = temp; 
        }
    }
}
    
System.out.println(Arrays.toString(arr));

}
}
