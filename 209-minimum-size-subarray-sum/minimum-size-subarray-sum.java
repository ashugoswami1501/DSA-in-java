class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minl=Integer.MAX_VALUE;
        int i=0,j=0,sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                minl=Math.min(minl,j-i+1);
                sum-=nums[i];
                i++;
                }
                j++;
            }
            if(minl!=Integer.MAX_VALUE)
                return minl;
            else{
                return 0;
            }
        }
    }
