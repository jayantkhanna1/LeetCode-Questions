class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char []charArr = new char[26];
            for (char ch : str.toCharArray()) {
                charArr[ch-'a']++;
            }
            String state = String.valueOf(charArr);
            if (!map.containsKey(state)) {
                map.put(state, new ArrayList<String>());
            }
            map.get(state).add(str);
        }
        return (new ArrayList<>(map.values()));
    }

}
