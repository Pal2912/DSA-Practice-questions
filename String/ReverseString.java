import java.util.*;
class Solution {
    char[] rev(char[] s, int p1 ,int p2){
    if(p1>=p2) return s;
    char temp=s[p1];
    s[p1]=s[p2];
    s[p2]=temp;
    return rev(s,p1+1,p2-1);
    }
    public void reverseString(char[] s) {
        int p1=0;
        int p2=s.length-1;
        rev(s,p1,p2);
    }
}