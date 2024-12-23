class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        Boolean[] maxCandy = new Boolean[candies.length];
        for(int n=0; n<candies.length; n++){
            if(candies[n] + extraCandies >= max){
               maxCandy[n] = true;
            }
            else{
                maxCandy[n] = false;
            }
        }
         List<Boolean> list = Arrays.asList(maxCandy);
         return list;
        

    }
}
