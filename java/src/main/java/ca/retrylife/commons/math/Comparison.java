package ca.retrylife.commons.math;

public class Comparison {

    // A very small number to be used for comparing floats
    public static final double kVerySmallNumber = 1e-12;

    public static boolean epsilonEquals(int a, int b, int epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    public static boolean epsilonEquals(double a, double b) {
        return epsilonEquals(a, b, kVerySmallNumber);
    }

    public static boolean epsilonEquals(double a, double b, double epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    public static boolean epsilonEquals(float a, float b) {
        return epsilonEquals(a, b, kVerySmallNumber);
    }

    public static boolean epsilonEquals(float a, float b, float epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

}