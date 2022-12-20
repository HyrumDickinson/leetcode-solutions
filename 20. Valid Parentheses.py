class Solution:
    def isValid(self, s: str) -> bool:

        # use a stack
        from collections import deque # O(1)
        stack = deque()# O(1)

        # put definitions in hashmap 
        hashmap = {# O(1)
            ')': '(', # O(1)
            '}': '{', # O(1)
            ']': '['# O(1)
        }# O(1)

        # add each item to stack
        # for chars in string
            # if item is value, add
            # if item is key, check if value is at top of stack
                # if so, pop it
                # if not, return False
        # if items remain in stack, return False
        # return True

        # this solution assumes that '({)}' is False

        # O(n) because we move through the string one char at a time,
        # and no operations per char take more than O(1)

        # if I were to use O(1) memory, I'd have to work only in the original
        # string, which would make O(n) time impossible
        # instead, I would in O(n log n) memory search the previously-covered
        # part of the string whenever an hashmap value was found (searching for
        # the key). But this would only work if the input was a linked list

        for char in s:# O(n)
            if char in hashmap:# O(1) because 'in' checks by getting the item
                # and seeing if something non-null is returned, rather than by 
                # iterating over the keys to search for item
                if len(stack) == 0: # O(1)# edge case i didn't think of beforehand
                    return False# O(1)
                if stack[-1] == hashmap[char]:# O(1)
                    stack.pop()# O(1)
                else:# O(1)
                    print(f'{stack[-1]} != {hashmap[char]}')
                    return False# O(1)
            else:# O(1)
                stack.append(char)# O(1)

        if len(stack) != 0: # O(1) because python items keep counter of length
            # at all times, rather than searching at call time to get it
            print(f'len(stack) is {len(stack)} and stack is {stack}')
            return False# O(1)
        
        return True# O(1)
