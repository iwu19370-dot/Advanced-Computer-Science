public class MatricesDemo {
    public static void main(String[] args) {
        int[][] table = new int[3][4]; // [row|][column--]

        table[1][2] = 50;
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        // irregular matrix, the rows are not the same length, so be careful accessing their values
        int[][] fun = {{1, 2, 3}, {4, 5}, {6, 7, 8}}; 
        for (int[] row : fun) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        // limit is 32 in java. Limitation for computer because of memory and space is limited
        int[][][] funtothemax = new int[3][3][3];
    }
}
