import java.util.*; 
class Solution {
    public static int[] twoSum(int[] a, int target) {
        int i=0, j=a.length-1;
        
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==target){
                return new int[] { i+1, j +1};
            }
            if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]={2,5,7,11};
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}