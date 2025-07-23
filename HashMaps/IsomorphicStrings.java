import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            
            if (map1.containsKey(charS) && map1.get(charS) != charT) {
                return false;
            }

             else {
                map1.put(charS, charT);
            }

            if (map2.containsKey(charT) && map2.get(charT) != charS) return false;
             else {
                map2.put(charT, charS);
            }

        }
        return true;
    }
}
