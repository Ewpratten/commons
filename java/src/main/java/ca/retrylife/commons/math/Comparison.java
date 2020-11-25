package ca.retrylife.commons.math;

/**
 * Comparison utils for floating-point numbers. Used to check is numbers are
 * close to being equal
 */
public class Comparison {

    // A very small number to be used for comparing floats
    public static final double kVerySmallNumber = 1e-12;

    /**
     * Check if two integers are equal within a range
     * 
     * @param a       Int a
     * @param b       Int b
     * @param epsilon Epsilon
     * @return Are equal?
     */
    public static boolean epsilonEquals(int a, int b, int epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two doubles are equal
     * 
     * @param a Double a
     * @param b Double b
     * @return Are equal?
     */
    public static boolean epsilonEquals(double a, double b) {
        return epsilonEquals(a, b, kVerySmallNumber);
    }

    /**
     * Check if two doubles are equal within a range
     * 
     * @param a       Double a
     * @param b       Double b
     * @param epsilon Epsilon
     * @return Are equal?
     */
    public static boolean epsilonEquals(double a, double b, double epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two floats are equal
     * 
     * @param a Float a
     * @param b Float b
     * @return Are equal?
     */
    public static boolean epsilonEquals(float a, float b) {
        return epsilonEquals(a, b, kVerySmallNumber);
    }

    /**
     * Check if two floats are equal within a range
     * 
     * @param a       Float a
     * @param b       Float b
     * @param epsilon Epsilon
     * @return Are equal?
     */
    public static boolean epsilonEquals(float a, float b, float epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

}