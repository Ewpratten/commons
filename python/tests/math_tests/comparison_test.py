from pycommons.math.comparison import epsilonEquals


def test_epsilonEquals():
    assert epsilonEquals(1, 5, 10)
