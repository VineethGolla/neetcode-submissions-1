class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int i=0;
        int ans=0;
        while(i<nums.length){
            if(set.contains(nums[i]-1)){
                i++;
                continue;
            }
            int count=1;
            int x=nums[i];
            while(count<=nums.length && set.contains(x+1)){
                count++;
                x++;
            }
            ans=Math.max(count,ans);
            i++;
        }
        return ans;
    }
}