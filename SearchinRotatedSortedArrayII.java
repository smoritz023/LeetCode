class Solution {
    public boolean search(int[] nums, int target) {
        int backpointer = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(backpointer >= i){
                if(nums[i] == target || nums[backpointer-1] == target){
                    return true;
                }
            }
            // if(nums[i] == target || nums[backpointer-1] == target){
            //     return true;
            // }
            backpointer--;
        }  
        return false;
    }
}