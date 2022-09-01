class Solution {
    public int removeElement(int[] nums, int val) {
        int sizeOfArr = nums.length;
        int notMatch = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                sizeOfArr -= 1;
            }
            else{
                nums[notMatch] = nums[i];
                notMatch += 1;
            }
        }
        return sizeOfArr;
    }
}