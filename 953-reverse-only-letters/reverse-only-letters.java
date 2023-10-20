class Solution {
    public String reverseOnlyLetters(String s) {
        char cAr[] = s.toCharArray();
        int start = 0;
        int last = s.length()-1;
        while(start<last){
            while(start<last && !Character.isAlphabetic(cAr[start])) start++;
            while(start<last && !Character.isAlphabetic(cAr[last])) last--;
            char temp = cAr[start];
            cAr[start] = cAr[last];
            cAr[last] = temp;
            start ++;
            last --;
        }       
        return new String(cAr);
    }
}