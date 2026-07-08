class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> data= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem= target-nums[i];
            if(data.containsKey(rem)){
                return new int[]{data.get(rem),i};
            }
            data.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
