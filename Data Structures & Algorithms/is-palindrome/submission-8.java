class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        String nS = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                nS += c;
            }
        }
        
        nS = nS.toLowerCase();

        int left = 0;
        int right = nS.length() - 1;

        while (left < right) {
            if (nS.charAt(left) != nS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
