class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        StringBuilder filteredString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(c);
            }
        }
        
        String nS = filteredString.toString().toLowerCase();
        
        char[] charArray = nS.toCharArray();

        int left = 0;
        int right = nS.length() - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
