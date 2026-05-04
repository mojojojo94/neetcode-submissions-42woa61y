class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        if (s.length() <= 1 || s.length() >= 1000) {
            return false;
        }

        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        char[] parens = s.toCharArray();

        for (char c : parens) {
            if (map.containsKey(c)) {
                if (stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
