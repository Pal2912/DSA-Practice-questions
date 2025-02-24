import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            count++;
        }
        else{
            count=1;
            ans=nums[i];
        }
        if(count>(nums.length)/2){
            return ans;
        }
        }
        return ans;
    }
}