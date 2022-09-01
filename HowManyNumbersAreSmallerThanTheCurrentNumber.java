class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int outNums[] = new int[nums.length];        
        for(int i = 0; i < nums.length; i++){
            int comparator = nums[i];
            int counter = 0;
            for(int j = 0; j < nums.length; j++){
                if(comparator >  nums[j]){
                    counter++;
                }
            }
            outNums[i] = counter;
        }
        return outNums;
    }
}