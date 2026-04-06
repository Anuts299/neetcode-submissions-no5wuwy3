class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq_s = new HashMap<>();
        Map<Character, Integer> freq_t = new HashMap<>();

        for (char char_s : s.toCharArray()) {
            freq_s.put(char_s, freq_s.getOrDefault(char_s, 0) + 1);
        }

        for (char char_t : t.toCharArray()) {
            freq_t.put(char_t, freq_t.getOrDefault(char_t, 0) + 1);
        }

        return freq_s.equals(freq_t);
    }
}
