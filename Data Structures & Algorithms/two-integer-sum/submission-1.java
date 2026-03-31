class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                right=i;
                left=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return new int[]{left,right};
    }
}
