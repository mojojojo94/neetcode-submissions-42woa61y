class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            // Append length + separator + actual string
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find the position of the separator '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Move pointer to the start of the actual string
            i = j + 1;
            
            // Extract the string based on the known length
            decoded.add(str.substring(i, i + length));
            
            // Move pointer to the start of the next encoded block
            i += length;
        }
        return decoded;
    }
}
