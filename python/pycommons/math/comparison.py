"""Number comparison utilities"""

# A very small number used in floating-point comparison
VERY_SMALL_NUMBER = 1e-12


def epsilonEquals(a: float, b: float, epsilon: float) -> bool:
    """Check if two values are within a range of eachother

    Args:
        a (float): Value a
        b (float): Value b
        epsilon (float): Range to check in 

    Returns:
        bool: Are they near eachother?
    """

    return (a - epsilon <= b) and (a + epsilon >= b)
