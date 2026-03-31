class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int el:nums){
            set.add(el);
        }
        if(set.size() != nums.length){
            return true;
        }
        return false;
    }
}