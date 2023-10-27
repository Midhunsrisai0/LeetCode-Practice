class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character> tm = new TreeMap<>();
        for(int i=0;i<indices.length;i++){
            tm.put(indices[i], s.charAt(i));
        }
        String k ="";
        for(int i: tm.keySet()){
            k+=tm.get(i);
        }
        return k;
    }
}