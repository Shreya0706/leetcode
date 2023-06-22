// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//         int temp1[] = new int[nums.length];
//         int temp2[] = new int[nums.length];
//         int temp3[] = new int[nums.length];
//         for(int i = 0; i<nums.length; i++){
//             temp1[i]= nums[i]+nums[i];
//         }
//         for(int i = nums.length-1; i>=0; i--){
//             temp2[i]= nums[i]+nums[i];
//         }
//         for(int i = 0; i<nums.length; i++){
//             temp3[i]= temp1[i]-temp2[i];
//         }
//         // temp3[] = temp1[]-temp2[];
//         return temp3;
//     }
// }




class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        int[] temp3 = new int[nums.length];
        
        temp1[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp1[i] = temp1[i - 1] + nums[i];
        }
        
        temp2[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            temp2[i] = temp2[i + 1] + nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            temp3[i] = Math.abs(temp1[i] - temp2[i]);
        }
        
        return temp3;
    }
}
