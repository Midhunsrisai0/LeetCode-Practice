class Solution {
    
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int n[] = new int[l*2];
        for(int i=0;i<l;i++){
            n[i] = nums[i];
            n[i+l] = nums[i];
        }
        return n;
    }
}