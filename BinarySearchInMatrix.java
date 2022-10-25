

public class BinarySearchInMatrix {
    public String searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return "No";
        }
        int column = matrix[0].length - 1;
        int row = 0;
        while (column >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][column]) {
                return "Yes";
            } else if (target < matrix[row][column]) {
                column--;
            } else if (target > matrix[row][column]) {
                row++;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        BinarySearchInMatrix a = new BinarySearchInMatrix();
        System.out.println("The Target 5 is Found in Given Matrix ?" + a.searchMatrix(new int[][] { { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 5));
    }
}
