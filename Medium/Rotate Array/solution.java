class Solution {
    public void rotate(int[] nums, int k) {
        //1234567 -> 6712345
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int arr[], int left, int right){
        while(left < right){
            int left_num = arr[left];
            arr[left] = arr[right];
            arr[right]=left_num;
            right--;
            left++;
        }
    }
}
