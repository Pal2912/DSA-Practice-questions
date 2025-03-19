

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        boolean found = false;
        
        int minSize = Integer.MAX_VALUE;
       int sum = 0;
        for (int i = 0,j=0; j < n; j++) {
        sum += nums[j];
        while(sum >= target){
            int size = j - i + 1;  
            minSize = Math.min(minSize, size);
            sum=sum-nums[i];
            i++;
            found = true; 
        }
        }

        return (found) ? minSize : 0;
    }
}
