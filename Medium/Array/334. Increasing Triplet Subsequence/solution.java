class Solution {
    public boolean increasingTriplet(int[] nums) {
     int smallest=Integer.MAX_VALUE; int second_smallest=Integer.MAX_VALUE;
     for(int i=0; i<nums.length; i++){
        if(nums[i]<=smallest){
            smallest=nums[i];
        }
        else if(nums[i]<=second_smallest){
            second_smallest=nums[i];
        }else{
            //if its bigger than the smallest and the second smallest then its the biggest, completing
            //the triple
            return true;
        }
     }
     return false;
    }
}
