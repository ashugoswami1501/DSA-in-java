class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                thirdmax=secmax;
                secmax=max;
                max=nums[i];
            }
            else if(nums[i]>secmax){
                thirdmax=secmax;
                secmax=nums[i];
            }
            else if(nums[i]>thirdmax){
                thirdmax=nums[i];
            }
            if(nums[i]<min){
                smin=min;
                min=nums[i];
            }
            else if(nums[i]<smin){
                smin=nums[i];
            }
        }
        return Math.max(max*secmax*thirdmax,min*smin*max);
    }
}