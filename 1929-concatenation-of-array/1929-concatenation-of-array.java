class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n*2];
        for(int i = 0; i<n; i++){
            temp[i] = nums[i];
            
            
            
        }
        for(int j = 0; j<nums.length; j++){
                temp[j+n] = nums[j];
            
        }
        
        return temp;
    }
}