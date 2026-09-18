class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);
            group.putIfAbsent(signature, new ArrayList<>());
            group.get(signature).add(word);
            
        }
        return new ArrayList<>(group.values());
        } 
        
        
    
}
