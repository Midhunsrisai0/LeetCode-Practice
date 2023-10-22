class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
      for(int i=0;i<nums.length;i++){
          int n = nums[i];
          int c=0;
          for(int j=0;j<nums.length;j++){
              if(nums[j]<n) c++;
          }
          hm.put(n,c);
      }  
      for(int i=0;i<nums.length;i++){
          nums[i] = hm.get(nums[i]);
      } 
      return nums;
    }
}