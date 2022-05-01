package main.java.com.glasiem.methods;

public class Relax implements Method {
    @Override
    public void runMethod(double e) {
        int n = 0;
        double x0 = 1.75, x1, t = 0.0846525014, fx;
        System.out.println("n\txn\t\t\t\ttf(xn)");
        while (true) {
            fx = t*(Math.pow(x0, 3) - 5 * Math.pow(x0, 2) - 4 * x0 + 20);
            x1 = x0 + fx;
            System.out.println(n + "\t" + String.format("%,.10f", x0) + "\t" + String.format("%,.10f", fx));
            if (Math.abs(x1 - x0) < e) break;
            n++;
            x0 = x1;
        }
    }

    @Override
    public void iterCount(double e) {
        double q = 0.0423262507, x0 = 1.75, x1 = 2.25;
        double logTop = Math.log(Math.abs(x0 - x1) / e);
        double logBot = Math.log(1 / q);
        int n = (int) (logTop / logBot + 1);
        System.out.println("Estimated number of iterations: " + n);
    }
}
