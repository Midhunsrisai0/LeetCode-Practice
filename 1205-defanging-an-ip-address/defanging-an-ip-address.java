class Solution {
    public String defangIPaddr(String address) {
        String[] srr = address.split("\\.");
        String r ="";
        for(int i=0; i<srr.length-1;i++){
            r=r+srr[i]+"[.]";
        }
        r+=srr[srr.length-1];
        return r;
    }
}