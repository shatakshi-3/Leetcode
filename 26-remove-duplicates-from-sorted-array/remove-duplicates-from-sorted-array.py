from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        # Pointer for the position of the last unique element
        k = 1  # Start from the second element
        
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:  # Found a new unique element
                nums[k] = nums[i]  # Place it at the next position
                k += 1  # Move the unique position forward
        
        return k  # The number of unique elements
