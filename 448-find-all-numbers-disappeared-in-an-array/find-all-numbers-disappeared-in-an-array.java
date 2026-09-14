class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int var=1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(var)){
                lst.add(var);
            }
            var++;
        }
        return lst;
    }
}