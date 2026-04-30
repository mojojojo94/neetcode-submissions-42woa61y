class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 1 || s.length() > 1000) {
            return false;
        }

        String nS = s.toLowerCase().trim().chars()
    .filter(Character::isLetterOrDigit)
    .collect(StringBuilder::new, 
             StringBuilder::appendCodePoint, 
             StringBuilder::append)
    .toString();

        char[] sA = nS.toCharArray();
        
        int b = sA.length;
        
        for (int a = 0; a < sA.length/2; a++) {
            if (sA[a] != sA[b-1]) {
                return false;
            }
            b -= 1;
        }
     return true; 
    }
}
