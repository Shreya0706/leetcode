class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums); 
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
        
        
        // int res = nums[1]-nums[0];
        // for(int i = 0; i<nums.length-1; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         res = Math.max(res, nums[j]-nums[i]);
        //     }
        // }
        // return res;
        
    }
}