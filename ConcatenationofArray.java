class Solution {
    public int[] getConcatenation(int[] nums) {
        int lengthNums = nums.length; 
        int[] concatArr = new int[nums.length + nums.length];
        for(int i = 0; i < nums.length; i++){
            concatArr[i] = nums[i];
            System.out.println("first half " + concatArr[i]);
        }
        for(int i = 0; i < nums.length; i++){
            concatArr[i + lengthNums] = nums[i];
            System.out.println("second half " + concatArr[i]);

        }
        return concatArr;
    }
}