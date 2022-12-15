class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // inclusive boundaries
        int left = 0; 
        int right = nums.length - 1;
        int focus;
        
        // binary search
        while (left < right - 1) {
            focus = ((right - left) / 2) + left;
            if (nums[focus] == target) {
                return focus;
            } else if (nums[focus] < target) {
                left = focus;
                System.out.println("left is " + left);
            } else {
                right = focus;
                System.out.println("right is " + right);
            }
        }
        System.out.println("exited while loop");
        
        if (nums[left] >= target) {
            return left;
        } else if (target > nums[right]) {
            return right + 1;
        } else {
            return right;
        }
        
    }
}

// search with O(log n) complexity
// binary search
