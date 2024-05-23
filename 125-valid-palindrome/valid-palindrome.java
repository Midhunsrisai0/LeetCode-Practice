class Solution{
public  boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i <=j) {
            if (upper(c[i])) {
                c[i] = tolowercase(c[i]);
            }
            if (upper(c[j])) {
                c[j] = tolowercase(c[j]);
            }
            i++;
            j--;
        }
        i = 0;
        j = c.length - 1;
        while (i < j) {
            while (i<c.length&&!isalphanu(c[i])) {
                i++;
            }
            while (i<c.length&&!isalphanu(c[j])) {
                j--;
            }
            if(j<i){
                return true;
            }
            if (c[i] != c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public  char tolowercase(char c) {
        return (char) (c + 32);
    }
    public  boolean isalphanu(char c) {
        boolean b = (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') ? true : false;
        return b;
    }
    public  boolean upper(char c) {
        return (c >= 'A' && c <= 'Z') ? true : false;
    }
}