class Solution {
    public int sumOfUnique(int[] nums) {
        int c=0;
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i: nums) hm.put(i, hm.getOrDefault(i,0)+1);
        for(int i: hm.keySet()) if(hm.get(i)==1) c+=i;
        return c;
    }
}