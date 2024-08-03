package com;
public class LargestSmallerTarget{
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,8,10,12};
         int key= 9;
         System.out.println(BinaryCheck(arr,key));
  
}
    static int BinaryCheck(int[] arr,int key){
                int i = 0;               
     int j = arr.length-1;
     
    boolean isAsc = arr[i] < arr[i+1];
    while(i<=j){
           
        int mid =(i+j)/2;
           if (key == arr[mid]){
            return mid;
        }
    if (isAsc){
        if(key > arr[mid]){
        i = mid+1;
    }
        else if( key < arr[mid]) {
        j = mid-1;
    }
        else{
            if (arr[i] < key && arr[i+1] > key){
                return arr[i];
        }
        }
    }
    else{
            if(key>arr[mid]){
            j = mid-1;
            }
            else if(key < arr[mid]){
            i = mid+1;
            }
            else{
                if(arr[i]>key && arr[i+1] < key){
                return arr[i+1];
            }
            }

}
}
         return i%arr.length;   

    }
}
