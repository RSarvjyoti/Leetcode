class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            // If target is found
            if(nums[mid] == target) {
                return true;
            }
            
            // If we encounter duplicates, just skip the duplicates
            if(nums[low] == nums[mid] && nums[high] == nums[mid]) {
                low++;
                high--;
            } 
            // Check which part is sorted
            else if(nums[low] <= nums[mid]) {
                // Left part is sorted
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right part is sorted
                if(nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return false;
    }
}
