class Solution {
    public int removeDuplicates(int[] nums) {
        int unique_holder = 0; //because what if there's only 1 unique element (index 0)
        for(int j=1; j<nums.length; j++){ // traverse through
            if(nums[unique_holder]!=nums[j]){ // if there is a unique number from the last unique # 
            unique_holder++; //accomodate space for this new unique #
            nums[unique_holder]= nums[j]; // store this new number in this new spot
            }
        }
        return unique_holder+1; //unique_holder is just an index
}}
