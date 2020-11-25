package ca.retrylife.commons.math;

/**
 * 1-Dimensional Interpolation
 */
public class Interp1D {

    /**
     * Re-Map a value from one range to another
     * 
     * @param value       Value
     * @param input_low   Lowest possible input value
     * @param input_high  Highest possible input value
     * @param output_low  Lowest possible output value
     * @param output_high Highest possible output value
     * @return Re-Mapped value
     */
    public static int map(int value, int input_low, int input_high, int output_low, int output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Re-Map a value from one range to another
     * 
     * @param value       Value
     * @param input_low   Lowest possible input value
     * @param input_high  Highest possible input value
     * @param output_low  Lowest possible output value
     * @param output_high Highest possible output value
     * @return Re-Mapped value
     */
    public static double map(double value, double input_low, double input_high, double output_low, double output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Re-Map a value from one range to another
     * 
     * @param value       Value
     * @param input_low   Lowest possible input value
     * @param input_high  Highest possible input value
     * @param output_low  Lowest possible output value
     * @param output_high Highest possible output value
     * @return Re-Mapped value
     */
    public static float map(float value, float input_low, float input_high, float output_low, float output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

}