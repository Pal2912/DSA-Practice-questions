class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int max = citations[n - 1];
        int h_index = 0;

        int i = 0;
        for (int j = 0; j <= max; j++) {
            while (i < n && citations[i] < j) {
                i++;
            }
            int bookNumber = n - i;
                if (bookNumber >= j) {
                    h_index = j;
                }
        }
        return h_index;
    }
}
