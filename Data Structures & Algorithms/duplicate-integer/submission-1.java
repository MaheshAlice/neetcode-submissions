class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);      
        }
        return nums.length==temp.size() ? false : true;
    }
}