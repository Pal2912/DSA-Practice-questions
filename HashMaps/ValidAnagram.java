class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < m; i++) {
        char charS=s.charAt(i);
        char charT=t.charAt(i);

        if(map1.containsKey(charS)){
        map1.put(charS,map1.get(charS) + 1);
        }
        else{
            map1.put(charS,1);
        }

        if(map2.containsKey(charT)){
        map2.put(charT,map2.get(charT) + 1);
        }
        else{
            map2.put(charT,1);
        }

        }

        if(map1.equals(map2)){
            return true;
        }
        else{
           return false;
        }


    }
}