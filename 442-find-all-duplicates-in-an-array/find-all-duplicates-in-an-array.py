from typing import List

class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        duplicates = []
        
        for i in range(len(nums)):
            index = abs(nums[i]) - 1  # Get the index for the current number
            
            # If the value at this index is negative, it means we've seen this number before
            if nums[index] < 0:
                duplicates.append(index + 1)  # Append the duplicate number (index + 1)
            else:
                # Mark this number as seen by negating the value at the index
                nums[index] = -nums[index]
        
        return duplicates
