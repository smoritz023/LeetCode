class Solution {
    public int mostWordsFound(String[] sentences) {
        int wordCount = 0;
        for(int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].split(" ");
            for(int j = 0; j < words.length; j++){
                if(wordCount < j + 1){
                    wordCount = j + 1;
                }
            }
        }
        return wordCount;
    }
}