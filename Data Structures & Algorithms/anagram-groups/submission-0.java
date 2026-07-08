class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map= new HashMap<>();
        for(String word:words){
            char[] ch=word.toCharArray();
             Arrays.sort(ch);
             String sorted= new String(ch);
             if(!map.containsKey(sorted)){
                 map.put(sorted,new ArrayList<>());
             }
            map.get(sorted).add(word);
        }
        List<List<String>> result= new ArrayList<>();
        for(List<String> st:map.values()){
            result.add(st);
        }
        return result;
    }
}