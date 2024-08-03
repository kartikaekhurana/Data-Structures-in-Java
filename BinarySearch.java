
public class BinarySearch {
public static void main(String[] args) {
    int[] arr ={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50};
    int key = 50;
    System.out.println(Binary(arr, key));
}   
public static int Binary(int[] arr, int key){
    int i = 0;
    int j = arr.length - 1;
    while(i <= j){
    int mid = (i+j)/2;
    if (key == arr[mid]){
        return mid;
    }
    else if(key > arr[mid]){
        i = mid+1;
    }
     else {
        j = mid-1;
    }
    }
    return 0;
}
}
