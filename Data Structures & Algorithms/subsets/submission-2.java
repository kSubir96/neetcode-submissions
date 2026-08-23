class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, nums.length, res, new ArrayList<>(), 0);
        return res;
    }
    private void helper(int[] nums, int n, List<List<Integer>> res, List<Integer> temp, int i) {
        if(i==n) {
            res.add(new ArrayList<>(temp));
            return;
        }
        Integer x = nums[i];
        temp.add(x);
        helper(nums, n, res, temp, i+1);
        temp.remove(x);
        helper(nums, n, res, temp, i+1);
    }
}
