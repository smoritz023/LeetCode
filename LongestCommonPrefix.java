class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 0){
            return "";
        } 
        if(len == 1){
            return strs[0];
        }
        String prefix = strs[0];
        if(prefix.length() == 0){
            return "";
        }
        for(int i=1; i<len; i++){
            String tempPrefix = "";
            int strLen = strs[i].length();
            if (strLen == 0){
                prefix = "";
                break;
            } 
            int minLen = Math.min(strLen, prefix.length());
            for(int j=0; j<minLen; j++){
                if(prefix.charAt(j) == strs[i].charAt(j)){
                    tempPrefix += prefix.charAt(j);
                }
                else{
                    break;
                }
            }
            prefix = tempPrefix;
        }
        return prefix;
    }
}