package Replit;

public class Arrays2D83 {

    public static void main(String[] args) {
        int rows, sumRow, cols;
        int[][] a = {{1, 1, 2},
                {3, 1, 2},
                {3, 5, 3},
                {0, 1, 2}};
        rows = a.length;
        cols = a[0].length;
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println(sumRow);
        }
    }
}