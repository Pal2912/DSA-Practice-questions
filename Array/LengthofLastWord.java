class Solution {
    public int lengthOfLastWord(String s) {
    int count=0;
    char space=' '; 
    int i=s.length()-1;
  
    while(i>=0 && s.charAt(i) == space){
        i--;
    }
    
    while(i>=0 && s.charAt(i) != space){
        count++;
        i--;
    }
    
    return count;
    }
}