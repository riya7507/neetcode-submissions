class Solution {
    static void subset(List<List<Integer>> ans,int[] nums,int ind,List<Integer> arr){
        ans.add(new ArrayList<>(arr));
        for(int i=ind;i<nums.length;i++){
            if(ind!=i && nums[i]==nums[i-1]){
                continue;
            }
            arr.add(nums[i]);
            subset(ans,nums,i+1,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        subset(ans,nums,0,new ArrayList<>());
        return ans;
    }
}
