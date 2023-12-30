class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int length = nums.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // Map to store the frequency of elements
        
        int maxLength = 0; // Variable to store the maximum length of the subarray with frequency <= k
        
        // Loop through the array using two pointers: start and end
        for (end = 0; end < length; end++) {
            frequencyMap.put(nums[end], frequencyMap.getOrDefault(nums[end], 0) + 1); // Update frequency
            
            // If the frequency of the element exceeds 'k', adjust the window by moving 'start' pointer
            if (frequencyMap.get(nums[end]) > k) {
                while (start < end && frequencyMap.get(nums[end]) > k) {
                    // Shrink the window by moving 'start' pointer and updating frequencyMap
                    if (frequencyMap.get(nums[start]) == 1) {
                        frequencyMap.remove(nums[start]); // Remove element if its count is 1
                    } else {
                        frequencyMap.put(nums[start], frequencyMap.get(nums[start]) - 1); // Decrement frequency
                    }
                    start++;
                }
            }
            
            maxLength = Math.max(maxLength, end - start + 1); // Update maxLength for each iteration
        }
        
        return maxLength; // Return the maximum length of the subarray with frequency <= k
  
    }
}