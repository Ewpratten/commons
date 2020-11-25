#! /bin/bash

# Install GCC
apt-get update -y
apt-get install build-essential -y

# Install bazel
curl -LO "https://github.com/bazelbuild/bazelisk/releases/download/v1.7.4/bazelisk-linux-amd64"
mkdir -p ./bin
mv bazelisk-linux-amd64 ./bin/bazel
chmod +x ./bin/bazel