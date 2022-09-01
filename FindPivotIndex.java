class Solution{
    public int pivotIndex(int[] nums){
        int numSum = 0, leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            numSum += nums[i];
        }
        System.out.println(numSum);
        
        for(int i = 0; i < nums.length; i++){
            if(leftsum == (numSum - leftsum - nums[i])){
                return i;
            }
            leftsum += nums[i];
        }
        
        return -1;
    }
}