package main.java.com.glasiem.methods;

public class SimpleIter implements Method {
    @Override
    public void runMethod(double e) {
        int n = 0;
        double x0 = 6.25, x1;
        System.out.println("n\txn\t\t\t\txn-fi(xn)");
        while (true) {
            x1 = Math.pow(4 * Math.pow(x0, 2) + 15 * x0 - 18, 1.0 / 3);
            System.out.println(n + "\t" + String.format("%,.10f", x0) + "\t" + String.format("%,.10f", (x0 - x1)));
            if (Math.abs(x1 - x0) < e) break;
            n++;
            x0 = x1;
        }
    }

    @Override
    public void iterCount(double e) {
        double q = 0.574, a = 5.75, b = 6.25;
        double logTop = Math.log(Math.abs(b - a) / ((1 - q) * e));
        double logBot = Math.log(1 / q);
        int n = (int) (logTop / logBot + 1);
        System.out.println("Estimated number of iterations: " + n);
    }
}
