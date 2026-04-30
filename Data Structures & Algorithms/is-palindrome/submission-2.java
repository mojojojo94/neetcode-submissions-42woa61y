class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1 || s.length() > 1000) {
            return false;
        }

        String nS = s.toLowerCase().chars()
            .filter(Character::isLetterOrDigit)
            .collect(StringBuilder::new, 
                StringBuilder::appendCodePoint, 
                StringBuilder::append)
            .toString();

        char[] sA = nS.toCharArray();

        int a = 0;
        int b = sA.length-1;
        
        while (a <= b) {
            if (sA[a] != sA[b]) {
                return false;
            }
            a += 1;
            b -= 1;
        }
        return true; 
    }
}
