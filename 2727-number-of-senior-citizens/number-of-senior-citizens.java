class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s: details) if(Integer.parseInt(""+s.charAt(11)+s.charAt(12))>60) c++;
        return c;
    }
}