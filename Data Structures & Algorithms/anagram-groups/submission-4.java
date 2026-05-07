class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> orderedStringToValuesMap = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {

            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String orderedString = new String(charArray);

            orderedStringToValuesMap.putIfAbsent(orderedString, new ArrayList<>());
            orderedStringToValuesMap.get(orderedString).add(strs[i]);
        }
        
        return new ArrayList<>(orderedStringToValuesMap.values());
    }
}
