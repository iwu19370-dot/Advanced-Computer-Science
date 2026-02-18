public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfCols <= 0 || numberOfRows <= 0) {
            throw new IllegalArgumentException("Number of rows and columns can't be negative.");
        }
        int[][] newOne = new int[numberOfRows][numberOfCols];
        fillUpValue(newOne);
        this.matrix = newOne;

    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix.length == 0) {
            throw new IllegalArgumentException("Number of rows and columns can't be negative.");
        }
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        int[][] newOne = new int[3][3];
        fillUpValue(newOne);
        this.matrix = newOne;
    }

    public String toString() {
        String total = "";
        for (int[] rows : matrix) {
            for (int cells : rows) {
                total = total + cells + " ";
            }
            total = total + "\n";
        }
        int columns = matrix[0].length;
        return "=".repeat(columns * 2 - 1) + "\n" + total + "=".repeat(columns * 2 - 1);
    }

    public boolean equals(MatrixFun other) {
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] other) {
        if (matrix.length != other.length || matrix[0].length != other[0].length) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0) {
            throw new IllegalArgumentException("Can't be negative.");
        }
        if (rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Out of bounds.");
        }
        int[] copyOfA = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == rowA) {
                    copyOfA[j] = matrix[rowA][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == rowA) {
                    matrix[i][j] = matrix[rowB][j];
                }
                if (i == rowB) {
                    matrix[i][j] = copyOfA[j];
                }
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void fillUpValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }
}
