class Solution {
    public boolean isSubsequence(String s, String t) {
       int s_pointer=0;
       int t_pointer=0;
       int num_same=0;
       while(s_pointer<s.length() && t_pointer<t.length()){
            if(s.charAt(s_pointer) == t.charAt(t_pointer) ){
                s_pointer++;
                t_pointer++;
                num_same++;
            }else{
                t_pointer++;
            }
       }
       if(num_same != s.length()){
        return false;
       }
       return true;
       
    }
}
