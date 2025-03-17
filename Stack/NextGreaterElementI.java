class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        for (int i=0;i<nums2.length;i++){
            int nextGreater=-1;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                nextGreater=nums2[j]; 
                break;
                }
            }
                nextGreaterMap.put(nums2[i],nextGreater);
        }
        int[] ans = new int[nums1.length];
        int idx=0;
        for(int num:nums1){
           ans[idx]= nextGreaterMap.getOrDefault(num, -1);
           idx++;
        }

        return ans;
    }
}