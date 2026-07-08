class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last= strs[strs.length - 1];
        int count=0,i=0;
        while(i<first.length()){
            if(first.charAt(i) == last.charAt(i)){
                count++;
                i++;
            }
            else {break;}
        }
        return last.substring(0,count);
    }
}