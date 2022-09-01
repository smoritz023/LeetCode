class Solution {
    public boolean isPowerOfThree(int n) {
        double d = n;
        double t = 3;
        double o = 1;
        while(d > t){
            d = d / t;
        }
        if(d == t || d == o){
            return true;
        }
        else{
            return false;
        }
    }
}