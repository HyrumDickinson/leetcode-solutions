class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // create variables
        int[] solution = new int[2];
        Integer index1;
        Integer index2;
        Integer value1;
        Integer value2;
        
        // copy array to map
        HashMap<Integer,Integer> numsHash = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            // put nums in map index first number second
            numsHash.put(i, nums[i]);
        }
        
        // loop through all nums in map by index
        for (Integer j : numsHash.keySet()) {
            index1 = j;
            value1 = numsHash.get(index1);
            // if target - value exists
            if (numsHash.containsValue(target - value1)) {
                // and if their indices are not equal
                for (Integer k : numsHash.keySet()) {
                    if (numsHash.get(k) == target - value1) {
                        if (k != j) {
                            index2 = k;
                            value2 = numsHash.get(index2);
                            solution[0] = index1;
                            solution[1] = index2;
                        }
                    }
                }
            } 
        }
       return solution;
    }
}

// lesson: maps cannot have duplicate keys
