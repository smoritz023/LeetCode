class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        System.out.println(s);
        char[] o = new char[length];
        for(int i = s.length-1; i > -1; i--){
            int j = s.length-1 - i;
            o[j] = s[i];
        }
        for(int i = 0; i < o.length; i++){
            s[i] = o[i];
        }
    }
}