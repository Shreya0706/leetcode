class Solution {
    public int countDigits(int num) {
        int a=num, c=0;
        while(num>0)
        {
            if(a%(num%10)==0)
                c++;
            num/=10;
        }
        return c;
    }
}