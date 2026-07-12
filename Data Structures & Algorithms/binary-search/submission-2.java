class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int en = n-1;

        int mid;// = st + (en-st)/2;

        while(st<=en) {
            mid = st + (en-st)/2;
            System.out.println("mid: "+mid);
            if(nums[mid] == target) return mid;
            else if(nums[mid]> target) {
                en = mid -1;
            } else {
                st = mid + 1;
            }
            
        }
        return -1;
    }
}
