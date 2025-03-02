import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] word = s.split(" ");
        
        if(pattern.length()!=word.length){
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        int length = pattern.length();

        for (int i = 0; i < length; i++) {
            char charP = pattern.charAt(i);
            String words=word[i];

            if (map1.containsKey(charP) && !map1.get(charP).equals(words)) {
                return false;
            }

            else {
                map1.put(charP, words);
            }

            if (map2.containsKey(words) && !map2.get(words).equals(charP))
                return false;
            else {
                map2.put(words, charP);
            }

        }
        return true;

    }
}
