class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        // int b[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            nums[i] = s;
        }
        return nums;
    }
}