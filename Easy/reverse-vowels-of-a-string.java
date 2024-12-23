class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
            //move the start pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            
            //move the end pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            
           
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            //increment indexes accordingly
            start++;
            end--;
        }
        
        String answer = new String(word);
        return answer;
    }
}
