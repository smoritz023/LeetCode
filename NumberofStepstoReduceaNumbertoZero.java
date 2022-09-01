class Solution {
    public int numberOfSteps(int num) {
        int modNum = num;
        int steps = 0;
        while(modNum > 0){
            if(modNum % 2 == 0){
                modNum = modNum / 2;
                steps++;
            }
            else{
                modNum = modNum - 1;
                steps++;
            }
        }
        System.out.println(steps);
        
        return steps;
    }
}