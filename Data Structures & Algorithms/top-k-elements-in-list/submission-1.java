class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans[]=new int[k];
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(); 

        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            bucket.get(value).add(key);
        }

        int count=k-1;
        for(int i=bucket.size()-1;i>=0 && count >= 0;i--){
            for(int j=0;j<bucket.get(i).size() && count >= 0;j++){
                ans[count]=bucket.get(i).get(j);
                    count--;
            }
        }
        return ans;

    }
}
