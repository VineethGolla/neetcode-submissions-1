class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                left=map.get(target-nums[i]);
                right=i;
                break;
            }
            map.put(nums[i],i);
        }
        return new int[]{left,right};
    }
}
