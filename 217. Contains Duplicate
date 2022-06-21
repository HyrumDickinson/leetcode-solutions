import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    
        int[] numsCopy = nums.clone();
        
        Arrays.sort(numsCopy);
        
        for (int i = 0; i < numsCopy.length - 1; i++) {
            if (numsCopy[i] == numsCopy[i + 1]) {
                return true;
            }
        }
        
        
        return false;
    }
}
