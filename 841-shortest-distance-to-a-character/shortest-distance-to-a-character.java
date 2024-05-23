class Solution {
    public int[] shortestToChar(String s, char c) {
        int l = s.length();
        int ar[] = new int[l];
        int prev=0;
        for(int i=0;i<l;i++) if(s.charAt(i)==c){
            prev=i;
            break;
        }
        for(int i=0;i<l;i++){
            if(s.charAt(i)==c) prev = i;
            ar[i] = Math.abs(i-prev);
        }
        // return ar;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)==c) prev=i;
            ar[i] = Math.min(ar[i], Math.abs(i-prev));
        }
        return ar;
    }
}