from setuptools import setup

def readme():
    with open("README.md") as f:
        return f.read()

def version():
    with open("python/VERSION") as f:
        return f.read()

setup(
    name = "pycommons",
    version = version(),
    description = "A personal common code library",
    long_description = readme(),
    classifiers = ["Environment :: Console", "Intended Audience :: Developers", "License :: OSI Approved :: GPLv3", "Operating System :: POSIX", "Programming Language :: Python :: 3.6", "Topic :: Software Development :: Libraries :: Python Modules"],
    keywords = "utility math",
    url = "https://github.com/ewpratten/commons",
    author = "Evan Pratten",
    author_email = "ewpratten@gmail.com",
    license = "GPLv3",
    packages=["pycommons"],
    install_requires=[],
)

