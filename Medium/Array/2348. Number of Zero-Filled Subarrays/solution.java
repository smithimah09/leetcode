class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum=0;
        long consequtive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                consequtive++;
                sum+=consequtive;
            }
            else{
                consequtive=0;
            }
        }
        return sum;
    }
} 
