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
        
        int b = sA.length-1;
        
        for (int a = 0; a < sA.length/2; a++) {
            if (sA[a] != sA[b]) {
                return false;
            }
            b -= 1;
        }
        return true; 
    }
}
