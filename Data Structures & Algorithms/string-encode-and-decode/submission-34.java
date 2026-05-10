class Solution {

    private static final char DELIM = '*';

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str.length()).append(DELIM).append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        ArrayList<String> decodedStrings = new ArrayList<>();
        
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != DELIM) {
                j++;
            }
            
            String lengthStr = str.substring(i, j);
            int length= Integer.parseInt(lengthStr);
            j++;
 
            String decodedString = str.substring(j, j + length);
            decodedStrings.add(decodedString);

            
            i = j + length;
        }

        return decodedStrings;
    }
}
