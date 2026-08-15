class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0;
        int leftMax = 0;

        for (char p : s.toCharArray()) {
            if (p == '(') {
                leftMin++;
                leftMax++;
            }
            else if (p == ')') {
                leftMin--;
                leftMax--;
            }
            else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) {
                return false;
            }
            if (leftMin < 0) {
                leftMin = 0;
            }
        }

        return leftMin == 0;
    }
}
