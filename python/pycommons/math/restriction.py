"""Utilities for restricting a value between two bounds"""


def clamp(value: float, min: float, max: float) -> float:
    """Clamp a value between a high and low value

    Args:
        value (float): Value to clamp
        min (float): Lowest possible value
        max (float): Highest possible value

    Returns:
        float: Clamped value
    """

    return max(min, min(value, max))
