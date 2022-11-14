class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # copying string to map O(n) because:
        # iterating through string is O(n)
            # checking if item-key exists in map is O(1)
            # if yes, incrementing value by 1 is O(1)
            # if no, placing item-key in set and setting value to 1 is O(1)
        # comparing two dictionaries is worst-case O(n)
        
        # O(n) solution is
        # create dictionary from s where the key is letter and value is occurance
        # do same with t
        # if s and t are equal, True
        # else False
        
        s_dict = self.create_dict(s)
        t_dict = self.create_dict(t)
        return s_dict == t_dict
        
    def create_dict(self, string: str) -> dict:
        dictionary = dict()
        for character in string:
            if character in dictionary:
                dictionary[character] += 1
            else:
                dictionary[character] = 1
        return dictionary
                
