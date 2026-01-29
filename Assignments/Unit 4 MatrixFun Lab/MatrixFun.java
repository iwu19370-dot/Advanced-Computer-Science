import static java.lang.Math.*;

public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public String toString() {
        String total = "";
        for (int[] rows : matrix) {
            for (int cells : rows) {
                total = cells + " ";
            }
            total = total + "\n";
        }
        return total;
    }

    public boolean equals(MatrixFun other) {
        return matrix.equals(other.matrix);
    }

    public void replaceAll(int oldValue, int newValue) {

    }

    public void swapRow(int rowA, int rowB) {

    }
}
