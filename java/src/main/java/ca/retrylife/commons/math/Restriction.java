package main.java.ca.retrylife.commons.math;

/**
 * Utilities for restricting a value between two bounds
 */
public class Restriction {

    /**
     * Clamp a value between a high and low value
     * 
     * @param value Value to clamp
     * @param low   Lowest possible value
     * @param high  Highest possible value
     * @return Clamped value
     */
    public static int clamp(int value, int low, int high) {
        return Math.max(low, Math.min(value, high));
    }

    /**
     * Clamp a value between a high and low value
     * 
     * @param value Value to clamp
     * @param low   Lowest possible value
     * @param high  Highest possible value
     * @return Clamped value
     */
    public static double clamp(double value, double low, double high) {
        return Math.max(low, Math.min(value, high));
    }

    /**
     * Clamp a value between a high and low value
     * 
     * @param value Value to clamp
     * @param low   Lowest possible value
     * @param high  Highest possible value
     * @return Clamped value
     */
    public static float clamp(float value, float low, float high) {
        return Math.max(low, Math.min(value, high));
    }

}