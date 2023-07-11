class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int a = nums.length/2;
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        int i = 0;
        for(; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(a<count){
            return nums[i];
            }
        }
        
        
        return -1;
    }
}