class Solution {
    public int[] runningSum(int[] nums) {
        int temp[] = new int[nums.length];
        temp[0]=nums[0];
        for(int i = 1; i<nums.length; i++){
            temp[i]= temp[i-1]+nums[i];
        }
        return temp;
    }
}