class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> x = new HashMap<>();
        int max_num = nums[0]; //  this is the mode
        int max_count = 1; // frequency
        for(int i=0; i<nums.length; i++){
            x.put(nums[i], 1+ x.getOrDefault(nums[i], 0));
            if(x.get(nums[i])>max_count){
                max_num = nums[i];
                max_count = x.get(nums[i]);
            }
        }
        return max_num;
    }
}
