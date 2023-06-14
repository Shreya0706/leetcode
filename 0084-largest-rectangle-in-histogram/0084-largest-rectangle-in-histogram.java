class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s=new Stack<>();
        int area = 0;
        int top;
        int curr;
        for(int i = 0; i<heights.length; i++){
            // int cur = heights[i];
            // for(int j = i-1;j>=0; j--){
            //     if(heights[j]>=heights[i]){
            //         cur+=heights[i];
            //     }
            //     else{
            //         break;
            //     }
            // }
            while(s.isEmpty()==false && heights[s.peek()]>=heights[i]){
                top=s.peek();s.pop();
                curr=heights[top]* (s.isEmpty() ? i : i - s.peek() - 1);
                area=Math.max(area,curr);
            }
            s.add(i);
        }
        while(s.isEmpty()==false){
            top=s.peek();s.pop();
            curr=heights[top]* (s.isEmpty() ? heights.length : heights.length - s.peek() - 1);
            area=Math.max(area,curr);
            
            
            
            
            // for(int j = i+1; j<heights.length; j++){
            //     if(heights[j]>=heights[i]){
            //         cur+=heights[i];
            //     }
            //     else
            //         break;
            // }
            // area = Math.max(area,cur);
        }
        return area;
        
    }
}