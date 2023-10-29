class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        if(nums[l]<nums[h]) return nums[0];
        while(l<=h){
            if(nums[l]<=nums[h]) return nums[l];
            int mid = (l+h)/2;
            if(nums[l]<=nums[mid]  && nums[h]<=nums[mid]) l=mid+1;
            else h=mid;
        }
        return -1;
    }
}