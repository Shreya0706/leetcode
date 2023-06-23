class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 0; i<nums.length; i++){
            int a = nums[0]*nums[1];
            int b = nums[nums.length-1]*nums[nums.length-2];
            c = b-a;
        }
        return c;
    }
}