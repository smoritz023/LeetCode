class Solution {
    public double myPow(double x, int n) {
        double product = 0.00;
        if(n == 0){
            return 1;
        }
        else if(n > 0){
            product = (Math.pow(x,n));
        }
        else if(n < 0){
            product = (Math.pow(x,n));
        }
        return product;
    }
}