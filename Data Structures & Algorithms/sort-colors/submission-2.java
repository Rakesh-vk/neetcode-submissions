class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,mid=0;
        while(mid<=j){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[i];
                nums[i] = temp;
                mid++;
                i++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[j];
                nums[j]= temp;
                
                j--;
            }
            else mid++;
        }
    }
}