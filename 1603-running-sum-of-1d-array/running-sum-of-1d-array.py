class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        rsum=0
        run_sum=[]
        for num in nums:
            rsum+=num
            run_sum.append(rsum)
        return run_sum