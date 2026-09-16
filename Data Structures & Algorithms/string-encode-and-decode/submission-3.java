class Solution {

 public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String word : strs) {
            sb.append("5#").append(word);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s.isEmpty()) return result;

        // Split on the delimiter "5#", skip empty prefix before first word
        String[] parts = s.split("5#", -1);

        // parts[0] will be empty if string starts with "5#", so skip it
        for (int i = 1; i < parts.length; i++) {
            result.add(parts[i]);
        }
        return result;
    }
}
