class Solution {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        // int temp[] = new int[nums.length];
        // for(int i = 1; i<nums.length; i++){
        //     if(nums[i]!=nums[i-1]){
        //         temp[i-1] =nums[i];
        //     }
        // }
        // if(temp.length>=3){
        //     return temp[temp.length-3];
        // }
        // else if(temp.length<=2){
        //     return temp[temp.length-1];
        // }
        // // else if(nums.length==1){
        // //     return nums[nums.length-1];
        // // }
        // else{
        //     return 0;
                      
        
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
        }
}
