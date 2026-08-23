class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> res = new ArrayList<>();
        helper(c, 0, new ArrayList<>(), c.length, t, res);
        return res;
    }
    private void helper(int[] c, int t, List<Integer> temp, int n, int target,
                        List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(temp));
        }
        if(t>=n) {
            return;
        }
        for(int i=t; i<n; i++) {
            if(i>t && c[i] == c[i-1])
                continue;
            if(c[i]>target) {
                break;
            }
            temp.add(c[i]);
            // System.out.print("{pre}->"+temp+" ,");
            helper(c, i+1, temp, n, target-c[i], res);
            temp.remove(temp.size()-1);
            // System.out.print("{post}->"+temp+" ,");
        }
    }
}
