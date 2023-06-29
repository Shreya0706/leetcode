class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        while(max != min){
            if(max>min){
                max = max-min;
            }
            else{
                min = min-max;
            }
        }
        return max;
        
        
        
        
        
//         int gcd = nums[0];
//         for (int i = 2;i < nums.length; i++) {
//             gcd = findGCD(gcd, nums[i]);
//         }
//         return gcd;
//     }

//     private int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
    }
    
    
    
    

}