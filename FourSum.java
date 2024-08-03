public class FourSum {
    public static void main(String[] args){
        int[] arr = {2,3,4,2,14,4,6,7,2,66,74};
        int target = 18;
        Fourtarget(arr,target);
        
    }
public static void Fourtarget(int[] arr, int target){
    for(int i = 0 ; i < arr.length  ; i++ ){
        for(int j = i+1 ; j < arr.length ; j ++ ){
            int sum = 0;
            for(int k = i ; k <= j ; k ++){
                sum += arr[k];      
                    }
            if (sum==target){
               for(int k = i ; k <= j ; k ++){
                  System.out.print(arr[k] + " ");               }
            }
                }
            }
}
}                       
            

