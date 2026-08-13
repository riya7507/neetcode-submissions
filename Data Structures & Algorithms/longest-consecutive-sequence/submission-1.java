class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        if(n==0||n==1){
            return n;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int longest=0;
        int count=0;

        for(int it:set){
            
            if(!set.contains(it-1)){
                count=1;
                int st=it;
                while(set.contains(st+1)){
                    count++;
                    st=st+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
