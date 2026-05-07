class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> orderedStringToValuesMap = new HashMap<>();
        
        for (String str : strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String orderedString = new String(charArray);

            orderedStringToValuesMap
            .computeIfAbsent(orderedString, k ->  new ArrayList<>())
            .add(str);
        }
        
        return new ArrayList<>(orderedStringToValuesMap.values());
    }
}
