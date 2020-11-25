"""Calculations involving angles"""

import math


def getWrappedAngleDegrees(current: float, desired: float) -> float:
    """Given any two angles, get the closest distance between them

    Args:
        current (float): Current / starting angle
        desired (float): Desired / end angle

    Returns:
        float: Closest distance
    """

    # This is either the distance or 360 - distance
    phi = math.abs(desired - current) % 360
    distance = 360 - phi if phi > 180 else phi

    # Determine the sign (is the difference positive of negative)
    sign = 1 if (desired - current >= 0 and desired - current <=
                 180) or (desired - current <= -180 and desired - current >= -360) else -1

    # Return the final difference
    return distance * sign


def getWrappedErrorRadians(current: float, desired: float) -> float:
    """Given any two angles, get the closest distance between them

    Args:
        current (float): Current / starting angle
        desired (float): Desired / end angle

    Returns:
        float: Closest distance
    """

    return math.radians(getWrappedAngleDegrees(math.degrees(current), math.degrees(desired)))
