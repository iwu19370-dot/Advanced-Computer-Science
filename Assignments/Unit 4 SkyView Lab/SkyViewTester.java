public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = new double[] {0.1, 0.2, 0.3, 0.4, 0.5, 0.6};
        double[] scanned1 = new double[] {0.2, 0.4, 0.6, 0.8, 1.0, 1.2};
        SkyView skyview = new SkyView(2, 3, scanned);
        SkyView skyview1 = new SkyView(2, 3, scanned1);
        System.out.println(skyview.toString());
        System.out.println(skyview.equals(skyview1));
        System.out.println(skyview.getAverage(0, 1, 0, 1));
    }
}
