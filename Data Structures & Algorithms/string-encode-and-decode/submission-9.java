class Solution {

    private static final char DELIM = '-';

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str.length()).append(DELIM).append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();

        List<String> decodedStrings = new ArrayList<>();        

        int i = 0;
        while(i < str.length()) {
            int j = i;

            while (str.charAt(j) != DELIM) {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            j++;
            String s = str.substring(j, j + length);

            decodedStrings.add(s);

            i = j + length;
        }

        return decodedStrings;
    }
}
