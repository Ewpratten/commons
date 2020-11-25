package ca.retrylife.commons.math;

/**
 * Calculations involving angles
 */
public class Angles {

    /**
     * Given any two angles, get the closest distance between them
     * 
     * @param current Current / starting angle
     * @param desired Desired / end angle
     * @return Closest distance
     */
    public static double getWrappedErrorDegrees(double current, double desired) {
        double phi = Math.abs(desired - current) % 360; // This is either the distance or 360 - distance
        double distance = phi > 180 ? 360 - phi : phi;

        // Determine the sign (is the difference positive of negative)
        int sign = (desired - current >= 0 && desired - current <= 180)
                || (desired - current <= -180 && desired - current >= -360) ? 1 : -1;

        // Return the final difference
        return distance * sign;
    }

    /**
     * Given any two angles, get the closest distance between them
     * 
     * @param current Current / starting angle
     * @param desired Desired / end angle
     * @return Closest distance
     */
    public static double getWrappedErrorRadians(double current, double desired) {
        return Math.toRadians(getWrappedErrorDegrees(Math.toDegrees(current), Math.toDegrees(desired)))
    }

}