class Solution {
    int[][] memo;
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
        memo=new int[nums.size()+1][target+1];
        for(int[] arr:memo)Arrays.fill(arr,-1);

        int ans= memoization(nums,0,target);

        if(ans<=0)return -1;

        return ans;
    }
    
    //recursive
    
    public int recursive(List<Integer> list, int st, int target){
        if(target==0)return 0;

        if(target<0||st>=list.size())return Integer.MIN_VALUE+1001;
        
        int take=1+recursive(list,st+1,target-list.get(st));

        int ignore=recursive(list,st+1,target);

        return Math.max(take,ignore);
    }
    
    //memoization
    
    public int memoization(List<Integer> list, int st, int target){

        if(target==0)return 0;

        if(target<0||st>=list.size())return Integer.MIN_VALUE+1001;

        if(memo[st][target]!=-1)return memo[st][target];

        int take=1+memoization(list,st+1,target-list.get(st));

        int ignore=memoization(list,st+1,target);

        return memo[st][target]=Math.max(take,ignore);   
    }
}