class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();

        int l = 0, r = 0, n = s.length();
        int st = 0, res = 0;
        Set<Character> set = new HashSet<>();
        while(r<n) {
            char cr = s.charAt(r);
            while(set.contains(cr)) {
                char cl = s.charAt(l);
                l++;
                set.remove(cl);
            }
            set.add(cr);
            res = Math.max(res, r-l+1);
            r++;

        }
        return res;
    }
}
