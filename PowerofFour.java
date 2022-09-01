class Solution {
    public boolean isPowerOfFour(int n) {
        double d = n;
        double f = 4;
        double o = 1;
        while(d > f){
            d = d / f;
        }
        if(d == f || d == o){
            return true;
        }
        else{
            return false;
        }
    }
}