class Solution {
    public boolean checkValidString(String s) {
        int first = 0;
        int second = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='('){
                first++;
                second++;
            }
            else if(s.charAt(i)==')'){
                if(first>0){
                     first--;
                }
               
                second--;
            }
            else{
                if(first>0){
                     first--;
                }
                
                second++;
            }
            if(second<0)
                return false;
        }
        return first==0;
        
    }
}