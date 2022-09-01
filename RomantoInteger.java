class Solution {
    public int romanToInt(String s) {
        // int I = 1;
        // int V = 5;
        // int X = 10;
        // int L = 50;
        // int C = 100;
        // int D = 500;
        // int M = 1000;
        int sum = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(i >= 1){
                j = i - 1;
            }
            if(s.charAt(i) == 'I'){
                sum += 1;
            }
            if(s.charAt(i) == 'V'){
                sum += 5;
                if(s.charAt(j) == 'I'){
                    sum -= 2;
                }
            }
            if(s.charAt(i) == 'X'){
                sum += 10;
                if(s.charAt(j) == 'I'){
                    sum -= 2;
                }
            }
            if(s.charAt(i) == 'L'){
                sum += 50;
                if(s.charAt(j) == 'X'){
                    sum -= 20;
                }
            }
            if(s.charAt(i) == 'C'){
                sum += 100;
                if(s.charAt(j) == 'X'){
                    sum -= 20;
                }
            }
            if(s.charAt(i) == 'D'){
                sum += 500;
                if(s.charAt(j) == 'C'){
                    sum -= 200;
                }
            }
            if(s.charAt(i) == 'M'){
                sum += 1000;
                if(s.charAt(j) == 'C'){
                    sum -= 200;
                }
            }
        }
        return sum;
    }
}