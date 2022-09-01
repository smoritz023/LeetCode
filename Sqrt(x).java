class Solution {
    public int mySqrt(int x) {
        int y = floorSqrt(x);
        System.out.println(y);
        return y;
    }
    
    static int floorSqrt(int x){
//         //Base
//         if(x == 0 || x == 1){
//             return x;
//         }
        
//         //Starting from 1, try all numbers until
//         //i*i is greater than or equal to x.
//         int i = 1, result = 1;
        
//         while(result <= x){
//             i++;
//             result = i*i;
//         }
//         return i - 1;
            
        int sqr = (int) Math.sqrt(x);
        int result = (int) (sqr);
        return result;
    }
}