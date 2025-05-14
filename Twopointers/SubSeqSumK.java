import java.util.*;
class Solution {
    static int mod = 1000000007;

    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        int l = 0, m = n - 1;
        int count = 0;

        while (l <= m) {
            if (nums[l] + nums[m] <= target) {
                count = (count + pow[m - l]) % mod;
                l++;
            } else {
                m--;
            }
        }

        return count;
    }
}
