public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun matrix = new MatrixFun();
        System.out.println(matrix.toString());
        MatrixFun matrix1 = new MatrixFun();
        System.out.println(matrix1);
        System.out.println(matrix.equals(matrix1));
        int[][] tester = new int[3][3];
        int count = 0;
        for (int i = 0; i < tester.length; i++) {
            for (int j = 0; j < tester[i].length; j++) {
                tester[i][j] = count;
                count++;
            }
        }
        System.out.println(matrix.equals(tester));
        matrix.replaceAll(1, 9);
        System.out.println(matrix);
        matrix.swapRow(1, 2);
        System.out.println(matrix);
    } 
}
