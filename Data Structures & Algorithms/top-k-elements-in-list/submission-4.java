class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int ans[]=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<ArrayList<Integer>> x=new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            x.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            x.get(value).add(key);
        }
        int p=0;
        for(int i=x.size()-1;i>=0 && k>0;i--){
            for(int j=0;j<x.get(i).size() && k>0;j++){
                ans[p]=x.get(i).get(j);
                k--;
                p++;
            }
        }
        return ans;

    }
}