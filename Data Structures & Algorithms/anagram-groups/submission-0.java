class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // strategy:
        // traverse through array and add anagrams to new array
        // add all arrays together in the add for nested array
        // create an anagram checker too
        // create hashmap for already visited anagrams

        List<List<String>> resultList = new ArrayList<>();

    for (int i = 0; i < strs.length; i++) {
        // check first if current word is in result list
        // if so, move to next word
        String currentWord = strs[i];
        boolean exists = resultList
        .stream()
        .flatMap(Collection::stream)
        .anyMatch(word -> Objects.equals(word, currentWord));
        if (exists) {
            continue;
        }
        List<String> list = new ArrayList<>();
        list.add(currentWord);
        for (int j = i+1; j < strs.length; j++) {
            if (isAnagram(currentWord, strs[j])) {
                list.add(strs[j]);
            }
        }
        resultList.add(list);
    }

    return resultList;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}
