public class CheckPalindrome {
    public static void main(String[] args){
        int[] arr1 = {2,0,1};
        System.out.println(CheckFunction(arr1));
    }
    static int CheckFunction(int[] arr1){
            int i;
            int j = 0;
        do{

       for(i = 0 ; i < arr1.length ; i ++ ){
           for(j = arr1.length - 1 ; j >= 0 ; j--){
               if (arr1[i] == arr1[j]){
                   return 1;
               }
                   else{
                           return 0;
                           }
               
           }
       }
        }while(i <= j);
         return 0;   }

    }


