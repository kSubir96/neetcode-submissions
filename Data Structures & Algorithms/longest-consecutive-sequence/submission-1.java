class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();

        for(int i: nums) {
            hSet.add(i);
        }
        int res = 0;
        int curr = 0;
        int tr = 0;
        for(int i: hSet) {
            // int tr = 0;
            if(!hSet.contains(i-1)) {
                curr = i;
                tr = 0;
                while(hSet.contains(curr)) {
                    tr++;
                    curr ++;
                }
                res = Math.max(res, tr);
            }
        }
        return res;
    }
}
