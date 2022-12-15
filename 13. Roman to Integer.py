class Solution:
    def romanToInt(self, s: str) -> int:

        # O(n) is the fastest solution because you have to iterate through all values
        # no skipping is possible without leaving out information

        # there is no 'smart' way of converting roman numerals to numbers
        # no clever binary correspondance
        # so it will just have to be a big if else block
        # or maybe a hashmap
        # create hashmap - O(n)
            # key - symbol
            # value - value
            # see if next value needs subtracting by checking value
        # initialize sum
        # for char in string - O(n)
            # if hashmap value of next char is greater - O(1)
                # add value of next char minus value of current char - O(1)
                # jump ahead two chars - O(1)
            # else - O(1)
                # add value of char to sum - O(1)
                # jump ahead to next char - O(1)
        # return sum

        # define hashmap
        hashmap = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }

        # edge cases
        if len(s) == 1:
            return hashmap[s]

        # length guranteed to be two or more
        sum = 0
        left_pointer = 0
        while left_pointer + 1 < len(s):
            if hashmap[s[left_pointer]] < hashmap[s[left_pointer + 1]]:
                print(f'{hashmap[s[left_pointer]]} < {hashmap[s[left_pointer + 1]]}')
                sum += hashmap[s[left_pointer + 1]] - hashmap[s[left_pointer]]
                left_pointer += 2
            else:
                print(f'{hashmap[s[left_pointer]]} >= {hashmap[s[left_pointer + 1]]}')
                sum += hashmap[s[left_pointer]]
                left_pointer += 1

        # once length is 1 or 0
        if len(s) == left_pointer + 1:
            sum += hashmap[s[left_pointer]]

        return sum
