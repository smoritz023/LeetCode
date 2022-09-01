class Solution {
    public boolean isPowerOfTwo(int n) {
        double d = n;
        double t = 2;
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