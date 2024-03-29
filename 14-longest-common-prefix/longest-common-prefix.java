import java.util.TreeSet;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder fs= new StringBuilder();
        int minLength=strs[0].length();
        for(String i: strs){
            int l;
            l = i.length();
            if(l<minLength) minLength = l;
        }
        for(int i=0;i<minLength;i++){
            System.out.println("b --"+ i);
            TreeSet<Character> ts = new TreeSet<>();
            for(String s: strs) ts.add(s.charAt(i));
            if(ts.size()==1) fs.append(strs[0].charAt(i));
            else return fs.toString();
        }
        return fs.toString();
    }
}