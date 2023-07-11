class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        result.clear();

        Arrays.sort(nums);
        int prev = nums[0];
        int n = nums.length;
        int count = 1;
        boolean added = false;
        if(n == 1){
            result.add(prev);
            return result;
        }
        if(n==2){
            result.add(prev);
            if(prev != nums[1]) {
            result.add(nums[1]);
                
            }
            return result;
        }
        for (int i=1; i<n; i++) {
            if (prev == nums[i]) {
                count++;

                if(count > n/3 && !added) {
                    result.add(prev);
                    added = true;
                }
               
            } else {
                prev = nums[i];
                count = 1;
                added = false;
            }
        }
        return result;
        
        
        
//         int count = 1;
//         int a = nums.length/3;
//         Arrays.sort(nums);
//         if(nums.length==1){
//             return nums[0];
//         }
//         int i = 0;
//         for(; i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 count++;
//             }
//             if(a<count){
//             return nums[i];
//             }
//         }
        
        
//         return -1;
    }
}