public class KadaneAlgo {
public static void main(String[] args){
    int[] arr = {1,2,4,2,53,213,12,11};
long maxa = Kadane(arr);
        System.out.println("The maximum subarray sum is: " + maxa);}
public static long Kadane(int[] arr){
    long sum = 0;
        Long maxa = Long.MIN_VALUE;

    for(int i = 0; i< arr.length ; i ++){
        sum += arr[i];
    }
    if(sum > maxa){
        maxa = sum;
    }
    if(sum < maxa){
        sum = 0;
    }
    return maxa;
}
}