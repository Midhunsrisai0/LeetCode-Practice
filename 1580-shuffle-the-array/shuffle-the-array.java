class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        int k = 0;
        for(int i = 0, j = n; i < n; i ++,  j ++) {
            arr[k] = nums[i];
            k ++;
            arr[k] = nums[j];
            k ++;
        }
        return arr;
    }
}