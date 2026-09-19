class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                lst.add(nums[i]);
            }
        }
        return lst;
    }
}