class Solution {
    static void combination(int[] nums,int i,List<List<Integer>> ans,int target,List<Integer> temp){
            if(i==nums.length){
                if(target==0){
                     ans.add(temp);
                 }
                return;
            }
            if(nums[i]<=target){
                temp.add(nums[i]);
                combination(nums,i,ans,target-nums[i],new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }
            combination(nums,i+1,ans,target,new ArrayList<>(temp));
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        combination(nums,0,ans,target,new ArrayList<>());
        return ans;
    }
}
