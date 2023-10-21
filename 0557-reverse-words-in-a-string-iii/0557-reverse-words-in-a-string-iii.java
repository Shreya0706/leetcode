class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        
        for (String word : words) {
            reversed.append(reverse(word)).append(" ");
        }
        
        return reversed.toString().trim();
    }
    
    private String reverse(String s) {
        char[] strArray = s.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        
        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        
        return new String(strArray);
    }
}