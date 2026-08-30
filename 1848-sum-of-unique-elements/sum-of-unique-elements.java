class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum = 0,i=0,j=0;
        while (j < nums.length) {
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            if (j - i == 1) {
                sum += nums[i];
            }
            i = j;
        }
        return sum;
    }
}