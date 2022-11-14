class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m;
        
        while (l <= r) {
           m = (r - l / 2) + l;
           if (nums[m] == target) {
               return m;
           } else if (target < nums[m]) {
               r = m - 1;
           } else {
               l = m + 1;
           }
        }
        return -1;
    }
}
