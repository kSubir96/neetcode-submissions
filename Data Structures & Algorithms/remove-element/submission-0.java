class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length, i = 0;

        while(i<k) {
            if(nums[i] == val) {
                nums[i] = nums[k-1];
                nums[k-1] = val;
                --k;
            } else {
                i++;
            }
        }
        return k;
    }
}