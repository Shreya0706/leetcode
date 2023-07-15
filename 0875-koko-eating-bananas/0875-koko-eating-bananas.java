class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        
        for(int i = 0; i<piles.length; i++){
            if(piles[i]>end){
                end = piles[i];
            }
        }
        int ans = -1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(isEatingspeedValid(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        
    }
    boolean isEatingspeedValid(int[] piles, int eatingspeed, int h){
        int hourspent = 0;
        for(int i = 0; i<piles.length; i++){
            hourspent+= piles[i]/eatingspeed;
            if(piles[i]%eatingspeed!=0){
                hourspent+=1;
            }
            if(hourspent>h) return false;
        }
        return true;
    }
}