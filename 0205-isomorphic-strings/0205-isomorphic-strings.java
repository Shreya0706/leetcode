class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        char[] sToT = new char[256]; 
        char[] tToS = new char[256]; 
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sToT[sChar] == 0 && tToS[tChar] == 0) {
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            } else if (sToT[sChar] != tChar || tToS[tChar] != sChar) {
                return false; 
            }
        }
        
        return true;
    }
}