public class MergeSortedArray {
    public static void main(String[] args){
    int[] nums1 = {1,3,4,5,7};
    int[] nums2 = {2,5,8,9};
    sort(nums1,nums2);
    
}
    public static void sort(int[] nums1, int[] nums2){ 
        for(int i = 0 ; i <= nums1.length - 1 ; i++){
            for(int j = 0 ; j < nums2.length-1 ; j++){
               if(nums2[j] > nums1[i]){
                   nums1[i+1] = nums2[j];
               } 
               else if(nums2[j] < nums1[i]){
                 nums1[i-1] = nums2[j];
               }
            }
        }
        System.out.println(nums1);
    }
}
