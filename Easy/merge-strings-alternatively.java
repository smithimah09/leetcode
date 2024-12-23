class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        int count =0;
        while(count < word1.length() || count < word2.length() ){
            if(count < word1.length()){
                newWord.append(word1.charAt(count));
            }
            if(count < word2.length()){
                newWord.append(word2.charAt(count));
            }
            count++;
        }

        return newWord.toString();
    }
}
