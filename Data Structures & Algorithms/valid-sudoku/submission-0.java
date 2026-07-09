class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        // create hashSet to keep track of the data
        HashSet<String> set = new HashSet<>();
        int boxSize = (int) Math.sqrt(n);
        // iterate through the matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // get the num at particular location
                char num = board[row][col];
                // if the current char is . then continue
                if (num == '.')
                    continue;

                // check if the entry is present in the hashSet 
                // add returns true
                if (!set.add(num + " in row " + row) ||
                    !set.add(num + " in col " + col) ||
                    !set.add(num + " in box " + (row / boxSize) + "-" + (col / boxSize))) {
                    return false;
                }
            }
        }

        return true;
    }
}