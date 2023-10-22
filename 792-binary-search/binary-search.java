class Solution {
    int binSearch(int [] nums, int s, int e,int t){
        if(s<=e){
            int m = (s+e)/2;
            if(nums[m]==t) return m;
            else if(nums[m]>t)  return binSearch(nums, s, m-1,t);
            else return binSearch(nums,m+1,e,t);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l = nums.length;
        // if(l==1){
        //     if(nums[0]==target) return 0;
        //     return -1;
        // }
        int res = binSearch(nums,0,l-1,target);
        return res;
    }
}