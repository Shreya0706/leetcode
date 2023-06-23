class Solution {
    public int differenceOfSum(int[] nums) {
        int temp1 =0;
        int sum = 0;
        int d = 0;
        for(int i = 0; i<nums.length; i++){
            temp1+=nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            while(nums[i]>0){
                d =nums[i]%10;
                sum = sum+d;
                nums[i]=nums[i]/10;
            }
        }
        int temp2 = Math.abs(temp1-sum);
        return temp2;
    }
}