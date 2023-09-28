class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int temp1[] = new int[nums.length];
        // int temp2[] = new int[nums.length];
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i]%2==0){
        //         temp1[i] = i;
        //     }
        //     else{
        //         temp2[i]=i;
        //     }
        // }
        // for(int i = 0; i<temp1.length; i++){
        //     if(temp1[i]>temp1[i+1]){
        //         int temp = temp1[i];
        //         temp1[i]=temp1[i+1];
        //         temp1[i+1]=temp;
        //     }
        // }
        // for(int i = 0; i<temp2.length; i++){
        //     if(temp2[i]>temp2[i+1]){
        //         int tem = temp2[i];
        //         temp2[i]=temp2[i+1];
        //         temp2[i+1]=tem;
        //     }
        // }
        // int nums[] = temp1+temp2;
        // return a;
        
        
         int[] result = new int[nums.length];
    int evenIndex = 0;
    int oddIndex = nums.length - 1;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {
            // If the number is even, place it at the beginning of the result array
            result[evenIndex++] = nums[i];
        } else {
            // If the number is odd, place it at the end of the result array
            result[oddIndex--] = nums[i];
        }
    }

    return result;
    }
}