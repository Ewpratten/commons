load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_library(
    name = "commons_java",
    srcs = glob(["src/main/java/ca/retrylife/**/*.java"]),
    visibility = ["//visibility:public"],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/ca/retrylife/**/*.java"]),
    visibility = ["//visibility:public"],
)
