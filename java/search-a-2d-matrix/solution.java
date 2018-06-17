class Solution {
    // Iterative
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int last = matrix[0].length - 1;
        int start = 0, end = matrix.length - 1, mid;

        while (start >= 0 && start <= end) {
            mid = (end - start) / 2 + start;
            if (target < matrix[mid][0]) {
                end = mid - 1;
            } else if (target > matrix[mid][last]) {
                start = mid + 1;
            } else {
                return Arrays.binarySearch(matrix[mid], target) >= 0;
            }
        }

        return false;
    }
    // Let N be number of rows, M be length of each row
    // Time: O(logN + logM);
    // Space: O(1)

    // Recursive
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        return searchMatrix(matrix, target, 0, matrix.length - 1);
    }

    public boolean searchMatrix(int[][] matrix, int target, int startRow, int endRow) {
        if (startRow < 0 || startRow > endRow) return false;
        int last = matrix[0].length - 1;
        int mid = (endRow - startRow) / 2 + startRow;
        if (target < matrix[mid][0]) {
            return searchMatrix(matrix, target, startRow, mid - 1);
        } else if (target > matrix[mid][last]) {
            return searchMatrix(matrix, target, mid + 1, endRow);
        } else {
            return Arrays.binarySearch(matrix[mid], target) >= 0;
        }
    }
    // Let N be number of rows, M be length of each row
    // Time: O(logN + logM)
    // Space: O(logN), the stack can get logN levels deep in the worse case.
}
