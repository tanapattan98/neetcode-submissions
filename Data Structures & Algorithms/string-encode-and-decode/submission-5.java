class Solution {

    private static char DELIM = '-';

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            

            encodedString = encodedString
                                .append(str.length())
                                .append(DELIM)
                                .append(str);

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

            int length = 0;
            for (int k = i; k < j; k++) {
                length = length * 10 + (str.charAt(k) - '0');
            }
            String s = str.substring(j + 1, j + 1 + length);

            // int length = Integer.parseInt(str.substring(i, j--));
            // j++;
            // String s = str.substring(j, j + length);

            decodedStrings.add(s);

            i = j + 1 + length;
        }

        return decodedStrings;
    }
}
