public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%6s %8s\n", "C", "F");
        for (int c = -100; c <= 100; c++) {
            double f = CtoF(c);
            System.out.printf("%6d %8.2f\n", c, f);
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}