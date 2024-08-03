public class ThreeSumProblem {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,3,7,12};
        int target = 15; 
        System.out.print(ThreeSum(arr,target));
    }
    public static int[] ThreeSum(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
                    for(int j = 1; j < arr.length ; j++){
                            for(int k = 2; k < arr.length ; k++){
                                  if(arr[i] + arr[j] + arr[k] == target)
                                  {
                                      return new int[]{i,j,k};
                                  }
                                  }
                    }
        }
                    return new int[] {-1,-1,-1};  
    }
}