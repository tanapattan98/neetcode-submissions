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
        List<String> decodedStrings = new ArrayList<>();
        char[] charArray = str.toCharArray();

        if (charArray.length == 0) return decodedStrings;

        int i = 0;
        while(i < charArray.length) {
            int j = i;

            while (charArray[j] != DELIM) {
                j++;
            }

            int length = 0;
            for (int k = i; k < j; k++) {
                length = length * 10 + (charArray[k] - '0');
            }

            char[] strChars = Arrays.copyOfRange(charArray, j + 1, j + 1 + length);
            decodedStrings.add(new String(strChars));

            i = j + 1 + length;
        }

        return decodedStrings;
    }
}
