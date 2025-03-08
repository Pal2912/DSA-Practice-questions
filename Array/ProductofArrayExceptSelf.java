class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zerosCount = 0;

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zerosCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zerosCount > 1) {
                answer[i] = 0;
            } else if (zerosCount == 1) {
                answer[i] = (nums[i] == 0) ? product : 0;
            } else {
                answer[i] = product / nums[i];
            }
        }
        return answer;
    }
}