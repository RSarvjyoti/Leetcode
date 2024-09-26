class Solution {
    public int search(int[] nums, int target) {
            
            int l = 0, h = nums.length - 1;

            while(l <= h) {
                int mid = l + (h - l) / 2;

                // Check if the mid element is the target
                if(nums[mid] == target) {
                    return mid;
                }

                // Check which part of the array is sorted
                if(nums[l] <= nums[mid]) { 
                    // Left part is sorted
                    if(nums[l] <= target && target < nums[mid]) {
                        h = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    // Right part is sorted
                    if(nums[mid] < target && target <= nums[h]) {
                        l = mid + 1;
                    } else {
                        h = mid - 1;
                    }
                }
        }
        
        return -1;  // Return -1 if the array is not rotated sorted
    }

}
