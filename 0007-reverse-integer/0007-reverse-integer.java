class Solution {
    public int reverse(int x) {
       int res = 0;
        while(x != 0){
            int newRes = res*10 + x%10;
            if(newRes/10 != res)
                return 0;
            res = newRes;
            x /= 10;
        }
        return res;
    }
}