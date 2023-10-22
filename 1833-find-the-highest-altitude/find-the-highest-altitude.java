class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int s=0;
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            if(s>max) max=s;
        }
        return max;
    }
}