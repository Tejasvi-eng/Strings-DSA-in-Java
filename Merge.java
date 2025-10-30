import java.util.*;
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int k=m+n-1;//end of array to store largest
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){// We start storing from the end to avoid overwriting unmerged elements of nums1.  
// The largest elements are placed last, so merging backwards keeps everything sorted safely.
                nums1[k--]=nums1[i--];//does not overwrite
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){// // Handles remaining elements of nums2 when nums1 finishes early  
    // Because nums2 might still have smaller elements left to place
             nums1[k--]=nums2[j--];
        }
        while(i>=0){//handling exception
            nums1[k--]=nums1[i--];
        }
        for(i=0;i<=m+n;i++){
System.out.println(nums1[i]);
        }
        
    }
    public static void main(String args[]){
        int arr1[]={1,3,6,0,0,0};
        int arr2[]={2,5,7};
        int m=3;
        int n=3;
        merge(arr1,m,arr2,n);
    }

}