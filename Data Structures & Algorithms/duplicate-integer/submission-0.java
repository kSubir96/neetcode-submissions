class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean found = false;
        Set<Integer> s1 = new HashSet<>();
        for(int i: nums) {
            if(!s1.add(i)) return true;
        }
        return found;
    }
}