class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> numberList = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                  int tripletSum = nums[i] + nums[j] + nums[k];
               if (tripletSum == 0) {
                    numberList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j + 1]) j++;
                    while(j<k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } 
                else if(tripletSum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            
        }
        return numberList;
    }
}
