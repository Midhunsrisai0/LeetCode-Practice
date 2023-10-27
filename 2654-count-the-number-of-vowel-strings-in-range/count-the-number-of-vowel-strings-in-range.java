class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String word = words[i];
            if ((word.startsWith("a") || word.startsWith("A") || word.startsWith("e") || word.startsWith("E") ||
     word.startsWith("i") || word.startsWith("I") || word.startsWith("o") || word.startsWith("O") ||
     word.startsWith("u") || word.startsWith("U")) &&
    (word.endsWith("a") || word.endsWith("A") || word.endsWith("e") || word.endsWith("E") ||
     word.endsWith("i") || word.endsWith("I") || word.endsWith("o") || word.endsWith("O") ||
     word.endsWith("u") || word.endsWith("U"))) {
    count++;
}
        }
        return count;
    }
}