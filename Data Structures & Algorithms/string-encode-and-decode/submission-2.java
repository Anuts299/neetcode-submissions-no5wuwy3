class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String str : strs) {
            int length = str.length();
            s.append(length).append('#').append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int j;
        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            list.add(str.substring(i, j));
            i = j;
        }
        return list;
    }
}
