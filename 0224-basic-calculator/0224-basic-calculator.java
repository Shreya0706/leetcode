class Solution {
    public int calculate(String s) {
        int sign = 1, result = 0;
    Stack<Integer> st = new Stack<>();
    
    for( int i = 0; i < s.length(); i++ ){
        
        if( s.charAt(i) == ' ' ) continue;
        
        int num = 0;
        
        while( i < s.length() && Character.isDigit(s.charAt(i)) ) {
            num = num*10+s.charAt(i++)-'0';
        }
        
        result += sign*num;
        
        if( i == s.length() ) return result;
        
        if( s.charAt(i) == '+' ){
            sign = 1;
        }else if( s.charAt(i) == '-' ){
            sign = -1;
        }else if( s.charAt(i) == '(' ){
            st.push(result);
            st.push(sign);
            result = 0;
            sign = 1;
        } else if( s.charAt(i) == ')' ){
            result = result*st.pop() + st.pop();
        }
    }
    
    return result;
    }
}