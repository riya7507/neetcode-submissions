class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        int ans=0;
        if(x==0){
            return 0;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            long square=(long)mid*mid;
            if(mid==x/mid){
                return mid;
            }
            else if(square<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}