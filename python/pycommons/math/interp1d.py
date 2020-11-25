"""1-Dimensional Interpolation"""


def map(value: float, input_low: float, input_high: float, output_low: float, output_high: float) -> float:
    """Re-Map a value from one range to another

    Args:
        value (float): Value
        input_low (float): Lowest possible input value
        input_high (float): Highest possible input value
        output_low (float): Lowest possible output value
        output_high (float): Highest possible output value

    Returns:
        float: Re-Mapped value
    """

    return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low
