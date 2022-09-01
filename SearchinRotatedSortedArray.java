class Solution {
    public int search(int[] nums, int target) {
        int backpointer = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(backpointer >= i){
                if(nums[i] == target){
                    return i;
                }
                if(nums[backpointer] == target){
                    return backpointer;
                }
            }
            backpointer--;
        }  
        return -1;
    }
}