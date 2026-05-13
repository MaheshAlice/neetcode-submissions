class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int num : nums){
            result.put(num, result.getOrDefault(num, 0)+1);
        }
        return result.entrySet().stream()
                        .sorted((a,b) -> b.getValue() - a.getValue())
                        .limit(k)
                        .mapToInt(entry -> entry.getKey())
                        .toArray();
    }
}
