class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i=0;//officer
        int j=1;//CM
        int total_unique=1;//Number of houses
        while(j<nums.length)  {
            if( nums[j]==nums[j-1]){//Prior is same with current
                j++;// Move ahead
                continue;
            }
            //else{ //Prior is different , unique element found
nums[i+1]=nums[j];//Move element to start for count
i++;//Allocate officer to new member
total_unique++;//Increment unique count
j++;
            }
      //  }
        return total_unique;
          }
          public static void main(String args[]){
                int arr[]={1,1,2,2,3,4};
                System.out.println(removeDuplicates(arr));
          }
}