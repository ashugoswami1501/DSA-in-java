class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=0;
        while(n<nums.length){
            sum+=nums[n];
            min=Math.min(nums[n],min);
            n++;
        }
        return(sum-(min*nums.length));
    }
}