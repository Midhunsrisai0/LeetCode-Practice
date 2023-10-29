class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
    while (l <= h) {
        int mid = l + (h - l) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[l] <= nums[mid]) {
            // Left half is sorted
            if (target >= nums[l] && target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        } else {
            // Right half is sorted
            if (target > nums[mid] && target <= nums[h]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
    }
    return -1;
    }
}