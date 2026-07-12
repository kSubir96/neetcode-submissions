class Solution {
    public boolean isAnagram(String s, String t) {
        int sN = s.length();
        int tN = t.length();
        if(sN != tN) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<sN; i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int i=0; i<tN; i++) {
            char x = t.charAt(i);
            int cnt = map.getOrDefault(x, 0);
            if (cnt == 0) return false;
            map.put(x, cnt - 1);
        }

        // for(Map.Entry<Character,Integer> ent: map.entrySet()) {
        //     if(ent.getValue() != 0) return false;
        // }
        return true;
    }
}
