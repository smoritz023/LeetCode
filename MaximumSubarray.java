class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 0){
            return 0;
        }
        
        int n = nums.length;
        int[] maxPossibleSubarray = new int[n];
        maxPossibleSubarray[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            maxPossibleSubarray[i] = nums[i] + (maxPossibleSubarray[i-1] > 0 ? maxPossibleSubarray[i-1] : 0);
            maxPossibleSubarray[0] = Math.max(maxPossibleSubarray[0], maxPossibleSubarray[i]);
        }
        return maxPossibleSubarray[0];
    }
}