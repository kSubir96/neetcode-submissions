class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        boolean[] used = new boolean[n];
        helper(nums, nums.length, new ArrayList<>(), 0, used, res);
        return res;
    }

    private void helper(int[] nums, int n, List<Integer> temp, int t, 
                        boolean[] used,List<List<Integer>> res) {
        if(t>=n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<n; i++) {
            if(!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                helper(nums, n, temp, t+1, used, res);
                used[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
