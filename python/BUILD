load("@rules_python//python:defs.bzl", "py_library", "py_test")

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
