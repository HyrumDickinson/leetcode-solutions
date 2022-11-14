class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # convert set to list is O(n) because 
            # iterate through list is O(n)
            # add item to set (hashmap) is average O(1)
        # check if item is in set (hashmap) is average O(1)
        
        # create empty set O(1)
        # for each item in list O(n)
            # check if item is in set O(1)
                # if yes, return true O(1)
            # add item to set O(1)
        
        # worst-case scenario is O(1) + (O(n) * ((O(1) * O(1)) + O(1)))
        # time complexity is 0(n)
        
        nums_set = set()
        for num in nums:
            if num in nums_set:
                return True
            nums_set.add(num)
        return False
