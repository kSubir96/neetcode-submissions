class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        for(String s: strs) {
            String temp = s;
            while(s1.length()>0 && !temp.startsWith(s1)) {
                s1 = s1.substring(0, s1.length()-1);
            }
            if(s1.length()==0) return "";
        }
        return s1;
    }
}