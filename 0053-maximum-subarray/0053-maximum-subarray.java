class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum +=nums[i];
            if (sum > max) {
                max = sum;
            }

            
            if (sum < 0) {
                sum = 0;
            }
            // max = Math.max(max,sum);
//             for(int j = i; j<nums.length; j++){
                
                
// //                 for(int k = i; k<=j; k++){
                    
// //                 }
//                
//             }
        }
        return max; 
    }
}