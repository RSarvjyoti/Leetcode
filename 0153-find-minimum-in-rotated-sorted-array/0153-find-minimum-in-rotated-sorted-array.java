class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1, minElm = Integer.MAX_VALUE;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            // check it if left part is sorted
            if(nums[l] <= nums[mid]) {
                minElm = Math.min(minElm, nums[l]);
                l = mid + 1;
            }else {
                minElm = Math.min(minElm, nums[mid]);
                h = mid - 1;
            }
            
        }
        
        return minElm;
        
    }
}