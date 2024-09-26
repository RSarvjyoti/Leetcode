class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);

        return res;

    }

    static int findFirst(int arr[], int target) {
        int l = 0, r = arr.length - 1;
        int firstPos = -1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(arr[mid] == target) {
                firstPos = mid;
                r = mid - 1;
            }else if(arr[mid] > target) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }

        }

        return firstPos;

    }

     static int findLast(int arr[], int target) {
        int l = 0, r = arr.length - 1;
        int lastPos = -1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(arr[mid] == target) {
                lastPos = mid;
                l = mid + 1;
            }else if(arr[mid] > target) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }

        }

        return lastPos;

    }

}