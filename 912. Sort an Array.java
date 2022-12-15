class Solution {
    public int[] sortArray(int[] nums) {
       // merge_sort function
            // if array is size 0 or 1, returns the array
        if (nums.length < 2) {
            return nums;
        }
        
        int[] leftHalf = new int[nums.length/2];
        // System.out.println("nums.length/2 = " + nums.length/2);
        int[] rightHalf = new int[nums.length - nums.length/2];
        System.arraycopy(nums, 0, leftHalf, 0, nums.length/2);
        System.arraycopy(nums, nums.length/2, rightHalf, 0, nums.length - nums.length/2);
        
            // else, splits the array in half
        leftHalf = sortArray(leftHalf);
        rightHalf = sortArray(rightHalf);
            // calls self on each array
        return mergeArrays(leftHalf, rightHalf);
            // merges halves (this will only run after merge_sort has finished running on each subarray - so this is a depth-first sort)
        
        // return merge_sort(nums)
    }
    
    public int[] mergeArrays(int[] nums1, int[] nums2) {
        
        int nums1cursor = 0;
        int nums2cursor = 0;
        int merged_cursor = 0;
        int[] merged = new int[nums1.length + nums2.length];
        
        while (nums1cursor < nums1.length && nums2cursor < nums2.length) {
            if (nums1[nums1cursor] == Math.min(nums1[nums1cursor], nums2[nums2cursor])) {
                merged[merged_cursor] = nums1[nums1cursor];
                // System.out.println("merged[" + merged_cursor + "] = " + nums1[nums1cursor]);
                nums1cursor++;
            } else {
                merged[merged_cursor] = nums2[nums2cursor];
                // System.out.println("merged[" + merged_cursor + "] = " + nums2[nums2cursor]);
                nums2cursor++;
            }
            merged_cursor++;
        }
       
        // at this point, one of the arrays is sorted through
        // if nums1 isn't sorted through yet
            // finish sorting through it
        // else we know that it's nums2 that isn't sorted through yet
            // so we finish sorting through nums2
        while (nums1cursor < nums1.length) {
            // System.out.println("nums 2 finished; nums 1 added an element");
            merged[merged_cursor] = nums1[nums1cursor];
            nums1cursor++;
            merged_cursor++;
        }
        
        while (nums2cursor < nums2.length) {
            // System.out.println("nums 1 finished; nums 2 added an element");
            merged[merged_cursor] = nums2[nums2cursor];
            nums2cursor++;
            merged_cursor++; 
        }
        
        //System.out.println("assertion ran");
        //for (int i = 0; i < merged.length - 1; i++) {
        //    assert (merged[i + 1] >= merged[i]) : "array is not sorted correctly";
        //}
        
        return merged;
    }
}
