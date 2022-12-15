class Solution:
    def isPalindrome(self, x: int) -> bool:
        # palendrome: reads same from left to right as from right to left

        # O(n) solution
        # handle edge cases - result is given if number is not positive and has 2 digits
        # the number of times to check == half rounded down
        # for number of times to check
        # compare item at left pointer to item at right pointer
        # if not equal, not palindrome
        # increment, decrement

        # if for loop finishes, is palindrome

        # edge cases
        if x < 0:
            return False
        if len(str(x)) < 2:
            return True
        
        # equality checker
        for i, char in enumerate(range(int(len(str(x))/2))):
            if str(x)[i] != str(x)[len(str(x)) - 1 - i]:
                return False

        return True
