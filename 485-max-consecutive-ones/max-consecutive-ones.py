class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=0
        max=0
        for i in range(len(nums)):
            if nums[i]!=0:
                count+=1
            else:
                count=0
            if max<count:
                max=count
            
        return max