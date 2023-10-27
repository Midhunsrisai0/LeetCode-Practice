class Solution {
    public String reverseWords(String inp) {
        StringBuilder r =new StringBuilder();
        String[] srr = inp.split(" ");
        for(int i=0;i<srr.length;i++){
            String s = srr[i];
            for(int j=s.length()-1;j>=0;j--){
                r.append(s.charAt(j));
            }
            if(i<srr.length-1) r.append(" ");
        }
        return r.toString();
    }
}