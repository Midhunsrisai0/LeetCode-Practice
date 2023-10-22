class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxL=0;
        for(int i=0;i<sentences.length;i++){
            String[] sub = sentences[i].split(" ");
            int l = sub.length;
            if(l>maxL) maxL=l;
        }
        return maxL;
    }
}