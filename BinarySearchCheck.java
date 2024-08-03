package com;
public class BinarySearchCheck {
    public static void main(String args[]){
        int arr[] = {4,3,1};
         int key= 4;
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
     else {
        j = mid-1;
    }
    }
    else{
            if(key>arr[mid]){
            j = mid-1;
            }
            else{
            i = mid+1;
            }
            }
    }
    return 0;
}
    
}
