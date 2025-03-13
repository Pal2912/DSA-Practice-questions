class Solution {
    public int maxArea(int[] height) {
    int n=height.length;
    int maxArea=0;
    int i=0;
    int j=n-1;
        while(i<j){
            int width=j-i;
            int area=Math.min(height[i],height[j])*width;
            maxArea=Math.max(maxArea,area);  
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}