class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int f = -1;
        int l = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                if(f == -1) {
                    f = i;
                }
                l = i;
            }
        }

       res[0] = f;
       res[1] = l;

       return res;

    }
}