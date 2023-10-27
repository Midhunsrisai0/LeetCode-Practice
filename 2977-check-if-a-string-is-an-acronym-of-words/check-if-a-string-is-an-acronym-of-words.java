class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder k= new StringBuilder();
        for(int i=0;i<words.size();i++) k.append(words.get(i).charAt(0));
        return s.equals(k.toString());
    }
}