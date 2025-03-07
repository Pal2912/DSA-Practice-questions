class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.replaceAll("\\s+", " ");
        s=s.trim();
        String[] sentence=s.split(" ");
        for(int i=sentence.length-1;i>=0;i--){
        sb.append(sentence[i]);
        if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}