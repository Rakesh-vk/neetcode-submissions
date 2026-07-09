class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        return freq.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
