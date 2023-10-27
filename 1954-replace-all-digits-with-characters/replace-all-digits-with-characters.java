class Solution {
   public char shift(char ch, int n) {
    return (char) (ch + n);
}

public String replaceDigits(String s) {
    char[] ch = s.toCharArray();
    for (int i = 1; i < s.length(); i += 2) {
        if (Character.isDigit(ch[i])) {
            ch[i] = shift(ch[i - 1], Character.getNumericValue(ch[i]));
        }
    }
    StringBuilder sb = new StringBuilder();
    for (char c : ch) {
        sb.append(c);
    }
    return sb.toString();
}
}