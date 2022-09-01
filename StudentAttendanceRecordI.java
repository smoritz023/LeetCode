class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int p = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'P'){
                p++;
            }
            else if(c == 'A'){
                a++;
                if(a >= 2){
                    return false;
                }
            }
            else if(c == 'L'){
                if((i != 0) && (i < s.length() - 1) && (i != s.length())){
                    if((s.charAt(i-1) == 'L') && (s.charAt(i + 1) == 'L')){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}