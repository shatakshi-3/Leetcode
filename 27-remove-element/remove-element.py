from typing import List

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0  # Pointer for the position of the next non-val element
        
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]  # Move the non-val element to the front
                k += 1  # Increment the count of non-val elements
        
        return k  # k is the new length of the array with non-val elements
