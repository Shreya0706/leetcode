// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         for(int i = 1; i<nums.length-1; i+=2){
//             if(nums[i-1]!=nums[i]){
//                 return nums[i-1];
//             }
//         }
//         return (nums.length-1);
//     }
// }
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        
        
        return nums[nums.length - 1];
    }
}
