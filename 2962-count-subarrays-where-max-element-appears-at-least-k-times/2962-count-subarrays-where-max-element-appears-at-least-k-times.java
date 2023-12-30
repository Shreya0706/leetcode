class Solution {
    public long countSubarrays(int[] nums, int k) {
         List<Integer> store = new ArrayList<>();
    long ans = 0, maxItem = 0;
    for(int n: nums) maxItem = Math.max(maxItem, n);
    for(int i = 0; i < nums.length; ++i){
        if(nums[i] == maxItem) store.add(i+1);
        if(store.size() >= k) ans += store.get(store.size() - k);
    }
    return ans;
  
    }
}