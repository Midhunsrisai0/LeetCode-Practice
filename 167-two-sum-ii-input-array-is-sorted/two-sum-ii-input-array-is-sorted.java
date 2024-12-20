class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
        while(s<e){
            int cs = numbers[s]+numbers[e];
            if(cs==target){
                int[] ar = {s+1,e+1};
                return ar;
            }
            else if(cs>target) e--;
            else s++;
        }
        return null;
    }
}