class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int length=0;
        int curr=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            curr=nums[i];
            length=1;
            if(set.contains(nums[i]-1)){
                continue;
            }
            else{
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }
            }
            max=Math.max(length,max);
        }
        return max;
    }
}
