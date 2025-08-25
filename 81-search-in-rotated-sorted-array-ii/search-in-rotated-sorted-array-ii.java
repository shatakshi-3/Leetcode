class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return true; // Target found
            }

            // Handle duplicates
            if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                s++; // Skip the duplicates
                e--; // Skip the duplicates
            } 
            else if (nums[s] <= nums[mid]) { // Left half is sorted
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1; // Target is in the left half
                } else {
                    s = mid + 1; // Target is in the right half
                }
            } 
            else { // Right half is sorted
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1; // Target is in the right half
                } else {
                    e = mid - 1; // Target is in the left half
                }
            }
        }

        return false; // Target not found
    }
}
