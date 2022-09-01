import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] first = new char[s.length()];
        char[] second = new char[t.length()];
        for(int i = 0; i < s.length(); i++){
            first[i] = s.charAt(i);
            second[i] = t.charAt(i);
        }
        
        Arrays.sort(first);
        Arrays.sort(second);
        
        if(Arrays.equals(first, second)){
            return true;
        }
        else{
            return false;
        }
    }
}