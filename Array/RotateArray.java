class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] newArr = new int[k];
        int[] mergedArr = new int[(nums.length + newArr.length) - k];
        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            newArr[j] = nums[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            mergedArr[i] = newArr[i];

        }

        for (int i = 0; i < nums.length - k; i++) {
            mergedArr[newArr.length + i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = mergedArr[i];
        }
    }
}