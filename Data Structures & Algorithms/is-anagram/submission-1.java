class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> count_s = new HashMap<Character, Integer>();
        HashMap<Character, Integer> count_t = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char current_s = s.charAt(i);
            char current_t = t.charAt(i);

            
            if (!count_s.containsKey(current_s)) {
                count_s.put(current_s, 1);
            } else {
                int value = count_s.get(current_s);
                count_s.put(current_s, value + 1);
            }

            if (!count_t.containsKey(current_t)) {
                count_t.put(current_t, 1);
            } else {
                int value = count_t.get(current_t);
                count_t.put(current_t, value + 1);
            }
        }

        return count_s.equals(count_t);
    }
}
