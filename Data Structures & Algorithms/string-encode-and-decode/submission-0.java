class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < s.length()) {

        // Find '#'
        int j = i;
        while (s.charAt(j) != '#') {
            j++;
        }

        // Length of current string
        int len = Integer.parseInt(s.substring(i, j));

        // Move to the first character of the string
        j++;

        // Extract the string
        result.add(s.substring(j, j + len));

        // Move to the next encoded string
        i = j + len;
    }

    return result;
}
}
