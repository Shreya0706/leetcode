class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currMax = 0;
        int currMin = 0;

        for (int num : nums) {
            totalSum += num;
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }

        if (maxSum > 0) {
            return Math.max(maxSum, totalSum - minSum);
        } else {
           return maxSum;
        }
    }
}

        
        
        
//         int res = nums[0];
//         for(int i = 0; i<nums.length; i++){
//             int curr_max = nums[i];
//             int curr_sum = nums[i];
//             for(int j = 1; j<nums.length; j++){
//                 int index = (i+j)%nums.length;
//                 curr_sum+=nums[index];
//                 curr_max = Math.max(curr_max, curr_sum);
//             }
//             res = Math.max(res, curr_max);
//         }
//         return res;
//     }
// }