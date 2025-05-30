class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create a new array to hold the final result
        int answer[] = new int[nums.length];

        // fill the answer array with 1s, since 1 is the identity for multiplication
        Arrays.fill(answer, 1);

        // curr will hold the running product of all elements to the left of the current index
        int curr = 1;

        // first pass: left to right
        // for each index, store the product of all numbers that come before it
        for (int i = 0; i < nums.length; i++) {
            answer[i] = curr;           // store current product so far (before including nums[i])
            curr = curr * nums[i];      // update curr to include nums[i] for the next index
        }

        // reset curr to 1 to now calculate the product of all elements to the right
        curr = 1;

        // second pass: right to left
        // multiply each value in answer with the product of all numbers that come after it
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= curr;          // multiply with the running product from the right side
            curr *= nums[i];            // update curr to include nums[i] for the next index to the left
        }

        // return the final answer array
        return answer;
    }
}
