#! /bin/bash

# Determine version
export VERSION=$(cat ./java/VERSION)

~/bin/bazel build //java:commons_java
mkdir -p ~/.m2/repository/ca/retrylife/commons/$VERSION
mv ./bazel-bin/java/libcommons_java.jar ~/.m2/repository/ca/retrylife/commons/$VERSION/commons-java-$VERSION.jar