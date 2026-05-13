class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> result = new HashMap<>();
       for(String str: strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = new String(chs);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
       } 
       return new ArrayList<>(result.values());
    }
}
