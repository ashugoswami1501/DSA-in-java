class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int index=0;
        while(i<j){
            if(nums[i]>nums[j]){
                index=i;
                j--;
            }
            else{
                index=j;
                i++;
            }
        }
        return index;
    }
}