import java.lang.Math;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 and nums2 and sorted in acending order, but with duplicates possible
        
        // make new array
        // then copy it into m
        
        // maybe later I'll try to find out a way to make the array within m without having to do the copy
        
        int nums1cursor = 0;
        int nums2cursor = 0;
        int nums_cursor = 0;
        int[] nums = new int[m + n];
        // while no array has been completedly sorted through
        // if the smallest value we're looking at is in nums 1
        // put that nums1 value in nums
        // move the nums1 cursor
        
        
        // until reaching the end of the arrays
        while (nums1cursor < m &&
               nums2cursor < n) {
        System.out.println("first while loop ran");
        // compare the smallest element of each array
            int smol = Math.min(nums1[nums1cursor], nums2[nums2cursor]);
            nums[nums_cursor] = smol;
            if (nums1[nums1cursor] == smol) {     
                nums1cursor++;
            } else {
                nums2cursor++;
            }
            nums_cursor++;
        // add that element to the nums array
        
        // after comparing, move the cursor
        }
        
        int[] x;
        int y;
        int z;
        
        // if nums1 is already sorted through
            // sort through nums2
        // else
            // sort through nums1
        
        
        // once reaching the end of an array
        if (nums1cursor == m) { 
            System.out.println("finished nums1 first");
            x = nums2;
            y = n;
            z = nums2cursor;
        } else {
            System.out.println("finished nums2 first");
            x = nums1; 
            y = m;
            z = nums1cursor;
        }
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        while (z < y) {
            System.out.println("final while loop ran");
            nums[nums_cursor] = x[z];
            nums_cursor++;
            z++;
        }
        
        // take all the remaining items out of the other array and add them one by one to nums
        
        for (int i = 0; i < (m + n); i++) {
            nums1[i] = nums[i];
        }
        
        
        // check that each i + 1 element >= each ith element
        
    }
}
