class Solution {
    public int firstMissingPositive(int[] nums) {
        

        for(int i=0;i<nums.length; i++){
            while(nums[i]>=1 && nums[i]<=nums.length && nums[nums[i]-1] != nums[i] && nums[i]!= i+1){
                swap(nums[i]-1, i, nums);
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!= j+1 ){
                return j+1;
            }
        }
        return nums.length+1;
    }

    public void swap(int ind1, int ind2, int arr[]){
            int temp = arr[ind1];
            arr[ind1] = arr[ind2];
            arr[ind2]= temp;
    }
}
