class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        // int count=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(set.contains(nums[i]-1)){
                continue;
            }
            int x=nums[i];
            while(count<=nums.length && set.contains(x)){
                count++;
                x++;
            }
            max=Math.max(count,max);
            
        }
        return max;
    }
}
