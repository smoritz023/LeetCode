class Solution {
    public int searchInsert(int[] nums, int target) {
        int out = 0;
        boolean equality = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println("target is equal");
                equality = true;
                out = i;
            }
        }
        if(equality == false){
            for(int i = 0; i < nums.length; i++){
                if(target > nums[i]){
                    System.out.println("target is greater");
                    out = i + 1;
                }
            }
        }
        return out;
    }
}