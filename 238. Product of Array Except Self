class Solution {
    public int[] productExceptSelf(int[] nums) {
        // o(n^2) solution
            // loop through all items
            // for all items
            // loop through all items and multiply them
        // o(n) solution that violates constraing
            // loop through all items and multiply them
            // loop through all items again
            // for each item
            // answer[i] = product / nums[i]
        // o(n) solution
            // first go from left side
            // then go from right side
            // i.e.
            // make a prefix product array from the left
            // make a prefix product array from the right
            // multiply the prefix product arrays
            // return solution
        
//         int[] prefixLeft = new int[nums.length];
//         int[] prefixRight = new int[nums.length];
        
//         prefixLeft[0] = 1;
//         prefixLeft[1] = nums[0];
//         prefixRight[nums.length - 1] = 1;
//         prefixRight[nums.length - 2] = nums[nums.length - 1];
        
//         for (int i = 2; i < nums.length; i++) {
//             prefixLeft[i] = prefixLeft[i - 1] * nums[i - 1];
//         }
//         for (int i = nums.length - 3; i > -1; i--) {
//             prefixRight[i] = prefixRight[i + 1] * nums[i + 1];
//         }
        
//         int[] answer = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             answer[i] = prefixLeft[i] * prefixRight[i];
//         }
        
//         return answer;
        
        // o(n) complexity with o(1) extra space complexity
        
        int[] prefixLeft = new int[nums.length];
        int prefixRightRight;
        int prefixRight;
        
        prefixLeft[0] = 1;
        prefixLeft[1] = nums[0];
        prefixRightRight = 1;
        
        for (int i = 2; i < nums.length; i++) {
            prefixLeft[i] = prefixLeft[i - 1] * nums[i - 1];
        }
        
        for (int i = nums.length - 2; i > -1; i--) {
            prefixRight = prefixRightRight * nums[i + 1];
            prefixLeft[i] = prefixLeft[i] * prefixRight;
            prefixRightRight = prefixRight;
        }
        
        return prefixLeft;
       
    }
}
