public class SkyView {
    private double[][] view;

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfCols * numberOfRows < scanned.length) {
            throw new IllegalArgumentException("Can't fit in the SkyView.");
        }
        double[][] together = new double[numberOfRows][numberOfCols];
        int count = 0;
        for (int i = 0; i < together.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < together[i].length; j++) {
                    together[i][j] = scanned[count];
                    count++;
                }
            } else {
                for (int j = together[i].length - 1; j >= 0; j--) {
                    together[i][j] = scanned[count];
                    count++;
                }
            }
            
        }
        this.view = together;
    }

    public String toString() {
        String string = "";
        for (double[] row : view) {
            for (double cell : row) {
                string = string + cell + " ";
            }
            string = string + "\n";
        }
        return string;
    }

    public boolean equals(SkyView other) {
        if (this.view.length != other.view.length || this.view[0].length != other.view[0].length) {
            return false;
        }
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                if (view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (view.length <= endRow || endRow < startRow || startRow < 0) {
            throw new IllegalArgumentException("Out of bonds.");
        }
        if (view[0].length <= endCol || endCol < startCol || startCol < 0) {
            throw new IllegalArgumentException("Out of bonds.");
        }
        double total = 0;
        int countNumber = 0;
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[0].length; j++) {
                if (i >= startRow && i <= endRow && j >= startCol && j <= endCol) {
                    total = total + view[i][j];
                    countNumber++;
                }
            }
        }
        return total / countNumber;
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }
}