#! /bin/bash

# Determine version
export VERSION=$(cat ./java/VERSION)

mv ./bazel-bin/java/libcommons_java.jar $1/commons-java-$VERSION.jar