class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        int c = 0;
        for(int i: nums) {
            if(map.containsKey(i)) {
                int idx = map.get(i);
                res[0] = idx > c ? c : idx;
                res[1] = res[0] == idx ?  c : idx;
            }
            map.put(target-i, c++);
        }
        return res;
    }
}
