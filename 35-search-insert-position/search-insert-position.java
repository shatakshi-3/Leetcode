class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int n=nums.length;
        int e=n-1;
       
        int ans=n;
        while(s<=e){
             int mid=(s+e)/2;
            if(nums[mid]>=target){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}