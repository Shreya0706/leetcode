// revisit

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int num = n / 2;

        for (int i = 0; i < n / 2; i++) {
            result[i] = -num;
            result[i + n / 2] = num;
            num--;
        }

        return result;
    }
}
