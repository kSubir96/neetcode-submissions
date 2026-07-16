class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int cn = rows*cols;
        int st = 0;
        int en = cn-1;
        while(st<=en) {
            int m = st + (en - st)/2;
            int r = m/cols;
            int c = m%cols;
            System.out.println("row: "+r+", col: "+c);
            if(matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c]< target) {
                st = m + 1;
            } else {
                en = m - 1;
            }
        }
        return false;
    }
}
