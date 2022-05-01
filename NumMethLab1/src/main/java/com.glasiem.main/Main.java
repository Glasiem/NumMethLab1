package main.java.com.glasiem.main;

import main.java.com.glasiem.methods.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method method = null;
        double e = 0.001;
        System.out.println("""
                Choose your method
                1.Relaxation method
                2.Newton method
                3.Simple iterations method
                """);
        Scanner in = new Scanner(System.in);
        int methodNum = in.nextInt();
        System.out.println("""
                e = 0.001
                Do you want to change e?
                
                (Y/N)
                """);
        String changee = in.next();
        changee = changee.toUpperCase();
        if (changee.contentEquals("Y")) {
            System.out.print("Enter e:");
            e = in.nextDouble();
        } else if (!changee.contentEquals("N")) {
            System.out.println("""
                Input invalid
                
                e = 0.001
                """);
        }
        switch (methodNum) {
            case 1:
                method = new Relax();
                break;
            case 2:
                method = new Newton();
                break;
            case 3:
                method = new SimpleIter();
                break;
        }
        method.iterCount(e);
        method.runMethod(e);
    }
}
