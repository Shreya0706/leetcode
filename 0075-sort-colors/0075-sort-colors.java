class Solution {
    public void sortColors(int[] nums) {
        int[] temp = new int[nums.length];
        int a = 0;
        int b = 0;
        int c = 0;

        // Count the number of 0s, 1s, and 2s in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a++;
            } else if (nums[i] == 1) {
                b++;
            } else {
                c++;
            }
        }

        // Fill the temporary array with the sorted values
        for (int i = 0; i < a; i++) {
            temp[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            temp[i] = 1;
        }
        for (int i = a + b; i < a + b + c; i++) {
            temp[i] = 2;
        }

        // Copy the sorted values back to the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        // Print the sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
