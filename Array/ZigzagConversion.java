class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        int gap = numRows + (numRows - 2);
        int x = gap;
        int y = 0;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            if(j<n)
            sb.append(s.charAt(j));
            while (j < n) {
                j = x + j;
                if (x!=0 && j < n) {
                    sb.append(s.charAt(j));
                }
                j = y + j;
                if (y!=0 &&j < n) {
                    sb.append(s.charAt(j));
                }

            }
            x = x - 2;
            y = y + 2;
            
        }
        return sb.toString();
    }
}