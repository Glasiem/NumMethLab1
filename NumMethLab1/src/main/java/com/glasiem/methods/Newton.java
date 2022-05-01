package main.java.com.glasiem.methods;

public class Newton implements Method {
    @Override
    public void runMethod(double e) {
        int n = 0;
        double x0 = 6.5, x1, fx;
        System.out.println("n\txn\t\t\t\tf(x)");
        while (true) {
            fx = (Math.pow(x0, 3) - 8 * Math.pow(x0, 2) + 9 * x0 + 18);
            x1 = x0 - fx / (3 * Math.pow(x0, 2) - 16 * x0 + 9);
            System.out.println(n + "\t" + String.format("%,.10f", x0) + "\t" + String.format("%,.10f", fx));
            if (Math.abs(x1 - x0) < e) break;
            n++;
            x0 = x1;
        }
    }

    @Override
    public void iterCount(double e) {
        double q = 0.9787234042, x0 = 6.5, x1 = 5.5;
        double logTop = Math.log(Math.abs(x0 - x1) / e);
        double logBot = Math.log(1 / q);
        int n = (int) (Math.log(logTop / logBot) / Math.log(2) + 1 + 1);
        System.out.println("Estimated number of iterations: " + n);
    }
}
