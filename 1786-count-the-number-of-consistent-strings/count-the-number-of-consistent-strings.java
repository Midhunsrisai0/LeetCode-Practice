class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> s = new HashSet<>();
        int a=0;
        for(int i=0;i<allowed.length();i++) s.add(allowed.charAt(i));
        for(int i=0;i<words.length;i++){
            int flag=0;
            for(int j=0;j<words[i].length();j++) if(!s.contains(words[i].charAt(j))){
                flag=1;
                break;
            }
            if(flag==0) a++;
        }
        return a;
    }
}