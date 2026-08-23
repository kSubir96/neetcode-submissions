class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, nums.length, res, new ArrayList<>(), 0);
        return res; 
    }
    private void helper(int[] nums, int n, List<List<Integer>> res, List<Integer> temp, int i) {
        // if(i==n-1) {
        //     res.add(new ArrayList<>(temp));
        //     return;
        // }
        res.add(new ArrayList<>(temp));
        for(int t=i; t<n; t++) {
            if(t>i && (nums[t] == nums[t-1])) {
                continue;
            }
            temp.add(nums[t]);
            helper(nums, n, res, temp, t+1);
            temp.remove(temp.size()-1);
        }
    }
}
