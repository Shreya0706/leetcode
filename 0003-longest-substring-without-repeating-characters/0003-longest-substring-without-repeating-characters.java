class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, count = 0, maxCount = 0;
        
        // to store all english characters
        final boolean[] visited = new boolean[127];
        final int n = s.length();
        while (i < n) {
            
            // find first repeating character
            while (i < n && !visited[s.charAt(i)]) {
                count++;
                visited[s.charAt(i)] = true;
                i++;
            }
            
            // update max count
            maxCount = Math.max(maxCount, count);
            
            // checks if reached end
            if (i == n) break;
            
            // find the earlier occurance of i and remove all characters before that in the string
            while (s.charAt(j) != s.charAt(i)) {
                visited[s.charAt(j)] = false;
                j++;
                count--;
            }
            
            // move both the pointers to continue the max substring lookup
            j++;
            i++;
        }
        
        return maxCount;
    }
    
}