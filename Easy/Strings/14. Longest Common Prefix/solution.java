class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String currentcompare = strs[0];
        int length=currentcompare.length();
        for(int i=1; i<strs.length;i++){
            while(length>strs[i].length() || !strs[i].substring(0,length).equals(currentcompare)){
                length--;
                if(length==0){
                    return "";
                }
                currentcompare = currentcompare.substring(0,length);
            }
        }
        return currentcompare;
    }
}
