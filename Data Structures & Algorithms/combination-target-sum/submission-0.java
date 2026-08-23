class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(list, new ArrayList<>(), nums, nums.length, 0, target);
        return list;
    }
    private static void helper(List<List<Integer>> list, List<Integer> temp, 
                                int[] nums, int n, int idx, int target) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx; i<n; i++) {
            if(target< nums[i]) {
                break;
            }
            temp.add(nums[i]);
            helper(list, temp, nums, n, i, target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}
