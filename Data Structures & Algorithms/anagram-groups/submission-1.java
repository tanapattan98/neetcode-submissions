class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> orderedStringToIndexMap = new HashMap();
        
        
        for (int i = 0; i < strs.length; i++) {

            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String orderedString = new String(charArray);

            if (orderedStringToIndexMap.containsKey(orderedString)) {
                orderedStringToIndexMap.get(orderedString).add(strs[i]);
            } else {
                List<String> listOfString = new ArrayList();
                listOfString.add(strs[i]);
                orderedStringToIndexMap.put(orderedString, listOfString);
            }
        }

        List<List<String>> groupedAnagrams = new ArrayList();

        for (List<String> value : orderedStringToIndexMap.values()) {
            groupedAnagrams.add(value);
        }
        
        return groupedAnagrams;
    }
}
