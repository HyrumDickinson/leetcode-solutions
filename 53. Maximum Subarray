import java.lang.Math;

class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's algorithm - yay!
        int maxSum = nums[0];
        int current_subarray = 0;
        
        for (int i = 0; i < nums.length; i++) {
            current_subarray += nums[i];
            maxSum = Math.max(maxSum, current_subarray);
            if (current_subarray < 0) {
                current_subarray = 0;
            } 
        }
        
        return maxSum;
        
    }
}
