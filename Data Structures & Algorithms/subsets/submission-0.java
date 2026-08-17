class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums, nums.length, 0);
        return list;
    }
    private static void helper(List<List<Integer>> list, List<Integer> temp, int[] nums, int n, int t) {
        if(t == n) {
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[t]);
        helper(list, temp, nums, n, t+1);
        temp.remove(temp.size()-1);
        helper(list, temp, nums, n, t+1);
        
    }
}
