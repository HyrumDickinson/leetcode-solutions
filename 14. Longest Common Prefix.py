class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # O(n * m) where n is number of strings and m is length of strings (or length of longest string)
        # edge case: if no items, return ''
        # edge case: if 1 item, return item
        # initialize prefix as first item in array O(m)
        # for each item in array, except the first one O(n)
            # get length of each, compare until shortest length O(m)
            # compare prefix to string char index by char index until something doesn't line up O(m)
            # prefix is what lined up O(m)
        
        # edge cases
        if len(strs) < 1:
            return ''
        if len(strs) == 1:
            return strs[0]
        
        # algo
        prefix = strs[0] # O(m) where m is string length
        print(strs[1:])
        for string in strs[1:]: # O(k) where k is slice size
            smallest_length = min(len(prefix), len(string)) # O(m) where m is string length
            prefix = prefix[:smallest_length]
            print(prefix)
            for i in range(smallest_length): # O(m) where m is string length
                if prefix[i] != string[i]:
                    prefix = prefix[: i]
                    print(prefix)
                    break
            
        
        return prefix
