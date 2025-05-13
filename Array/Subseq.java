class Solution {
    int subSequence(int idx, int[] nums, int target,int sum) {
        if (idx == nums.length) {
            if (target <= sum)
                return 1;
            else
                return 0;
        }
        int l = subSequence(idx + 1, nums, target,sum+nums[idx]);
        int r = subSequence(idx + 1, nums, target,sum);
        return l+r;
    }

    public int numSubseq(int[] nums, int target) {
        
        return subSequence(0, nums, target,0);
    }
}