class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Use a map to store the sorted string as the key 
        // and the list of original anagrams as the value
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert to char array and sort to create a unique key for all anagrams
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            
            // Add the current string to its corresponding anagram group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        // Return all the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }
}
