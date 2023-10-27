class Solution {
    public String reverseWords(String inp) {
        String r ="";
        String[] srr = inp.split(" ");
        for(int i=0;i<srr.length;i++){
            String s = srr[i];
            for(int j=s.length()-1;j>=0;j--){
                r+=s.charAt(j);
            }
            if(i<srr.length-1) r+=" ";
        }
        return r;
    }
}