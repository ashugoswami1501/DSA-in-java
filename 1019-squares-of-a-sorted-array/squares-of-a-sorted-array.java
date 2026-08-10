class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] square=new int[nums.length];
        int n=nums.length;
        int l=0;
        int r=n-1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                square[i] = nums[l] * nums[l];
                l++;
            } else {
                square[i] = nums[r] * nums[r];
                r--;
            }
        }
        return square;
    }
}