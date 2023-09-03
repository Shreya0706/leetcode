class Solution {
    public int beautySum(String s) {
        int beautySum = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] charCount = new int[26]; 
            for (int j = i; j < s.length(); j++) {
                charCount[s.charAt(j) - 'a']++; 
                int maxCount = 0;
                int minCount = Integer.MAX_VALUE;
                for (int count : charCount) {
                    if (count > 0) {
                        maxCount = Math.max(maxCount, count);
                        minCount = Math.min(minCount, count);
                    }
                }
                beautySum += (maxCount - minCount);
            }
        }

        return beautySum;

    }
}