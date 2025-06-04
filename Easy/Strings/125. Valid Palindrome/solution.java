class Solution {
    public boolean isPalindrome(String s) {
       int sp=0;
       
       String rep=s.toLowerCase().replaceAll("[^a-z0-9]", "");
       int tp=rep.length()-1;
       while(sp<=tp){
        if(rep.charAt(sp) != rep.charAt(tp)){

            return false;
        }
        sp++;
        tp--;
       }
       return true;
    }
}
