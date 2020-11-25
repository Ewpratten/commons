load("@rules_python//python:defs.bzl", "py_library", "py_test")
load("//tools:python/pypi_package.bzl", "pypi_package")
load(":version.bzl", "version")

filegroup(
    name = "python",
    srcs = [
        ":pycommons",
    ],
    visibility = ["//visibility:public"],
)

exports_files([
    "requirements.txt",
])

py_library(
    name = "pycommons",
    srcs = glob([
        "pycommons/*.py",
        "pycommons/**/*.py",
    ]),
    srcs_version = "PY3",
)

py_test(
    name = "pycommons_test",
    srcs = glob([
        "tests/*_test.py",
        "tests/**/*_test.py",
    ]),
    imports = [
        ":pycommons",
    ],
    deps = [
        ":pycommons",
    ],
)

pypi_package(
    name = "pycommons_pkg",
    author = "Evan Pratten",
    author_email = "ewpratten@gmail.com",
    classifiers = [
        "Environment :: Console",
        "Intended Audience :: Developers",
        "License :: OSI Approved :: GPLv3",
        "Operating System :: POSIX",
        "Programming Language :: Python :: 3.6",
        "Topic :: Software Development :: Libraries :: Python Modules",
    ],
    description = "A personal common code library",
    keywords = "utility math",
    license = "GPLv3",
    long_description = "README.md",
    packages = [":pycommons"],
    url = "https://github.com/ewpratten/commons",
    version = version,
)
