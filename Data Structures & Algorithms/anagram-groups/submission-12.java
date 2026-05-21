class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] cArray = strs[i].toCharArray();
            Arrays.sort(cArray);
            String str = String.valueOf(cArray);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }


        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            result.add(new ArrayList<>(list));
        }

        return new ArrayList<>(map.values());
    }
}
