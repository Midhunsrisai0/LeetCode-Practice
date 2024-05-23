class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sar = s.split("\\s+");
        String op = "";
        for(int i=sar.length-1;i>0;i--) op+=sar[i]+" ";
        return op+sar[0];
    }
}