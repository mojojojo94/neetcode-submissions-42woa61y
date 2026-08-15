class Solution {
    public int lengthOfLongestSubstring(String s) {
        int head = 0;
        int tail = 0;

        int result = 0;

        Set<Character> set = new HashSet<>();

        while (head < s.length()) {
            if (!set.contains(s.charAt(head))) {
                set.add(s.charAt(head));
                head++;
                result = Math.max(set.size(), result);
            } else {
                set.remove(s.charAt(tail));
                tail++;
            }
        }

        return result;
    }
}
